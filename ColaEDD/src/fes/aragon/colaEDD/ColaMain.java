package fes.aragon.colaEDD;

public class ColaMain {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		ColaADT cola = new ColaADT();
		//Probamos que realmente se encuentre vacia la cola
		System.out.println(cola.isEmpty());
		
		//Agregamos datos a la cola
		cola.enqueue("Hola");
		cola.enqueue("Si");
		cola.enqueue("Hola2");
		cola.enqueue("Si2");
		
		//Probamos el metodo para obtener el tamaño de la cola
		System.out.println(cola.length());
		
		//Imprimimos la cola
		System.out.println(cola);
		
		//Probamos el metodo para borrar datos de la cola
		cola.dequeue();		
		
		//Imprimimos la cola
		System.out.println(cola);
		
		//Probamos el metodo para obtener el tamaño de la cola
		System.out.println(cola.length());
	}

}
