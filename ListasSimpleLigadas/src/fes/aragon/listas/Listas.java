package fes.aragon.listas;

public class Listas<T> {
	public static void main(String[] args) {
		ListaLADT<Integer> holachao = new ListaLADT<>();
		System.out.println("Mostrando el metodo estaVacio [isEmpty]");
		holachao.isEmpty();
		System.out.println("Mostrando el metodo agregarAlInicio [addFirst]");
		holachao.addFirst(8);
		holachao.mostrarVert();
		System.out.println("Mostrando el metodo estaVacio [isEmpty]");
		holachao.isEmpty();
		System.out.println("Mostrando el metodo agregarAlFinal [addLast]");
		holachao.addLast(5);
		holachao.mostrarVert();
		System.out.println("Mostrando el metodo agregarDespuesDe [addAt]");
		holachao.addAt(5, 7);
		holachao.mostrarVert();
		System.out.println("Lista despues de agregar algunos elementos");
		holachao.addFirst(420);
		holachao.addLast(91);
		holachao.addLast(1);
		holachao.addFirst(666);
		holachao.addFirst(46);
		holachao.addAt(1, 23);
		holachao.mostrarVert();
		System.out.println("Mostrando el metodo eliminarElFinal [DeleteLast]");
		holachao.deleteLast();
		holachao.mostrarVert();
		System.out.println("Mostrando el metodo eliminarElPrimero [DeleteFirst]");
		holachao.deleteFirst();
		holachao.mostrarVert();
		System.out.println("Mostrando el metodo eliminar [Delete]");
		holachao.delete(3);
		System.out.println("Mostrando el metodo actualizar");
		holachao.actualizar(5, 0);
		holachao.mostrarVert();
		System.out.println("Mostrando el metodo buscar");
		holachao.search(69);
		System.out.println("Mostrando el metodo para mostrarlo en vertical");
		holachao.mostrarVert();
		System.out.println("Mostrando el metodo estaVacia");
		holachao.isEmpty();
		System.out.println("Mostrando el metodo getLongitud [getLength]");
		holachao.getLength();

	}

}
