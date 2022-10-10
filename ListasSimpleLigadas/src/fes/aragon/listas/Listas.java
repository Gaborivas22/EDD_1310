package fes.aragon.listas;

public class Listas<T> {
	public static void main(String[] args) {
		ListaLADT<Integer> h = new ListaLADT<>();

		System.out.println("Metodo estaVacio() [isEmpty]");
		h.isEmpty();

		System.out.println("Metodo getLongitud() [getLength]");
		h.getLength();

		System.out.println("Metodo agregarAlFinal() [addLast]");
		h.addLast(5);
		h.transversal();

		System.out.println("Metodo agregarAlInicio() [addFirst]");
		h.addFirst(8);
		h.transversal();

		System.out.println("Metodo agregarDespuesDe() [addAt]");
		h.addAt(5, 7);
		h.transversal();

		h.addFirst(420);
		h.addLast(69);
		h.addLast(91);
		h.addLast(1);
		h.addLast(111);
		h.addAt(1, 23);
		System.out.println("Se agregan mas elementos a la lista");
		h.transversal();

		System.out.println("Metodo eliminar() [Delete]");
		h.delete(3);
		h.transversal();

		System.out.println("Metodo eliminarElFinal() [DeleteLast]");
		h.deleteLast();
		h.transversal();

		System.out.println("Metodo eliminarElPrimero() [DeleteFirst]");
		h.deleteFirst();
		h.transversal();

		System.out.println("Metodo buscar()");
		h.search(69);

		System.out.println("Metodo actualizar()");
		h.actualizar(5, 0);
		h.transversal();

		System.out.println("Metodo getTamanio()");
		h.getLength();

		System.out.println("Metodo transversal()");
		h.transversal();

		System.out.println("Metodo estaVacia()");
		h.isEmpty();

	}

}
