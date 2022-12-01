package fes.aragon.hs;

public class HashtablesSeparateChaining<L, V> {
	private static final int DEFAULT_CAPACITY = 3;
	private static final double DEFAULT_LOAD_FACTOR = 0.667;
	private double maxLoadFactor;
	int tam = 0,thereshold,capacidad;

	private ListaLADT<Entrada>[] table;

	public void add(L Llave, V valor) {
		if (tam >= thereshold) {
			cambiarTam();
		}
		Entrada entr = new Entrada(Llave, valor);
		int indi = normalizarIndice(entr.hash);
		if (table[indi] != null) {
			if (table[indi].tiene(entr)) {
				table[indi].actualizar(entr, entr);
			} else {
				table[indi].agregarAlPrincipio(entr);
				tam++;
			}
		} else {
			table[indi] = new ListaLADT<>();
			table[indi].agregarAlPrincipio(entr);
			tam++;
			
		}
	}
	
	public V valueOf(L llaveABuscar) {
		int bucketIndex = normalizarIndice(llaveABuscar.hashCode());
		for (Entrada elemento1 : table[bucketIndex]) {
			if ((elemento1.hash == llaveABuscar.hashCode()) && llaveABuscar.equals(elemento1.key))
				return elemento1.value;
		}
		return null;
	}
	
	public void remove(L LlaveParaBorrar) {
		Entrada aux1 = new Entrada(LlaveParaBorrar, null);
		if (search(LlaveParaBorrar)) {
			int bucketIndex = normalizarIndice(aux1.hash);
			table[bucketIndex].buscarYBorrar(aux1);
			tam--;
		}
	}
	
	public int getSize() {
		return tam;
	}

	private int normalizarIndice(int hashKey) {
		return (hashKey & 0x7FFFFFFF) % capacidad;
	}

	public boolean search(L llaveABuscar) {
		int bucketIndex = normalizarIndice(llaveABuscar.hashCode());
		for (Entrada elemento : table[bucketIndex]) {
			if ((elemento.hash == llaveABuscar.hashCode()) && llaveABuscar.equals(elemento.key))
				return true;
		}
		return false;
	}

	@SuppressWarnings("unchecked")
	public HashtablesSeparateChaining(double maxLoadFactor, int capacidad) {
		if (maxLoadFactor >= 1 && maxLoadFactor > 0) {
			this.maxLoadFactor = DEFAULT_LOAD_FACTOR;
		} else {
			this.maxLoadFactor = Double.max(DEFAULT_LOAD_FACTOR, maxLoadFactor);
		}
		this.capacidad = Integer.max(DEFAULT_CAPACITY, capacidad);
		thereshold = (int) (maxLoadFactor * capacidad);
		table = new ListaLADT[capacidad];
	}

	@SuppressWarnings("unchecked")
	private void cambiarTam() {
		capacidad = capacidad * 2;
		thereshold = (int) (capacidad * maxLoadFactor);
		ListaLADT<Entrada>[] tablaAnt = table;
		table = new ListaLADT[capacidad];
		tam = 0;
		for (ListaLADT<Entrada> perro : tablaAnt) {
			if (perro != null) {
				for (Entrada elemento : perro) {
					add(elemento.key, elemento.value);
				}
			}
		}
	}
	
	private class Entrada {
		public L key; // llave
		public V value;// valor
		public int hash;

		@Override
		public boolean equals(Object otraEntrada) {
			@SuppressWarnings("unchecked")
			Entrada other = (Entrada) otraEntrada;
			if (this.hash != other.hash)
				return false;
			return this.key.equals(other.key);
		}
		
		public Entrada(L llave, V valor) {
			this.key = llave;
			this.value = valor;
			this.hash = key.hashCode();
		}
	}

	public HashtablesSeparateChaining(double maxLoadFactor) {
		this(maxLoadFactor, DEFAULT_CAPACITY);
	}

	public HashtablesSeparateChaining() {
		this(DEFAULT_LOAD_FACTOR, DEFAULT_CAPACITY);
	}

	public HashtablesSeparateChaining(int capacidad) {
		this(DEFAULT_LOAD_FACTOR, capacidad);
	}

}
