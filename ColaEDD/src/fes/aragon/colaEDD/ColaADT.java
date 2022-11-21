package fes.aragon.colaEDD;

import java.util.ArrayList;

public class ColaADT <T> {
	ArrayList<T> arlCola = new ArrayList<>();
	int tam, top = 0;

	public ColaADT() {
	}
	
	@Override
	public String toString() {
		return "Tu cola creada es " + arlCola + " :D";
	}
	
	public int length() {
		return this.tam;
	}

	public boolean isEmpty() {
		return this.tam == 0;
	}

	public void enqueue(T dato) {
		arlCola.add(top, dato);
		this.top++;
		this.tam++;
	}
	
	public T dequeue() {
		T delete = null;
		if (!isEmpty()) {
			System.out.print("El dato eliminado fue: ");
			delete = arlCola.remove(0);
			this.tam=tam-1;
		} else {
			System.out.println("La Cola se encuentra vacia :c, agrega datos para poder usar el metodo");
		}
		return delete;
	}

}


