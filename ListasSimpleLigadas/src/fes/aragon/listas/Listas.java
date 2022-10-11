package fes.aragon.listas;

public class Listas<T> {
	public static void main(String[] args) {
		ListaLADT<Integer> k = new ListaLADT<>();

		System.out.println("Metodo estaVacio() [isEmpty]");
		k.isEmpty();

		System.out.println("Metodo getLongitud() [getLength]");
		k.getLength();

		System.out.println("Metodo agregarAlFinal() [addLast]");
		k.addLast(5);
		k.transversal();

		System.out.println("Metodo agregarAlInicio() [addFirst]");
		k.addFirst(8);
		k.transversal();

		System.out.println("Metodo agregarDespuesDe() [addAt]");
		k.addAt(5, 7);
		k.transversal();

		k.addFirst(420);
		k.addLast(69);
		k.addLast(91);
		k.addLast(1);
		k.addLast(111);
		k.addAt(1, 23);
		System.out.println("Se agregan mas elementos a la lista");
		k.transversal();

		System.out.println("Metodo eliminar() [Delete]");
		k.delete(3);
		k.transversal();

		System.out.println("Metodo eliminarElFinal() [DeleteLast]");
		k.deleteLast();
		k.transversal();

		System.out.println("Metodo eliminarElPrimero() [DeleteFirst]");
		k.deleteFirst();
		k.transversal();

		System.out.println("Metodo buscar()");
		k.search(69);

		System.out.println("Metodo actualizar()");
		k.actualizar(5, 0);
		k.transversal();

		System.out.println("Metodo getTamanio()");
		k.getLength();

		System.out.println("Metodo transversal()");
		k.transversal();

		System.out.println("Metodo estaVacia()");
		k.isEmpty();

	}

}
