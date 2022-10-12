package fes.aragon.listas;

public class ListaLADT<T> {
	Nodo<T> head;
	int tamanio;

	public ListaLADT() {
	}


	public boolean isEmpty() {
		System.out.println(this.head == null);
		return this.head == null;
	}


	public int getLength() {
		System.out.println("El tama\u00f1o de la lista es: " + this.tamanio);
		return this.tamanio;
	}


	public void addLast(T valor) {
		if (this.head == null) {
			head = new Nodo<>(valor);
		} else {
			Nodo<T> nuevo = new Nodo(valor);
			Nodo<T> aux = this.head;
			while (aux.getNext() != null) {
				aux = aux.getNext();
			}
			aux.setNext(nuevo);
			tamanio++;
		}
	}

	public void addFirst(T valor) {
		if (this.head == null) {
			head = new Nodo<>(valor);
		} else {
			Nodo<T> nuevo = new Nodo(valor);
			nuevo.setNext(head);
			head = nuevo;
			tamanio++;
		}
	}

	public void addAt(T referencia, T valor) {
		if (this.head == null) {
			System.out.println("La lista se encuentra vacia");
			head = new Nodo<>(valor);
		} else {
			Nodo<T> nuevo = new Nodo(valor);

			Nodo<T> aux = this.head;
			Nodo<T> aux2 = this.head.getNext();

			while (aux.getDato() != referencia) {
				aux = aux.getNext();
				aux2 = aux2.getNext();
			}
			aux.setNext(nuevo);
			aux.getNext().setNext(aux2);
			tamanio++;
		}
	}

	public void delete(int posicion) {
		int posi = 0;
		if (head == null) {
			System.out.println("La lista se encuentra vacia, no es posible borrar un elemento");
		} else {
			Nodo<T> aux_anterior = this.head;
			Nodo<T> aux = this.head.getNext();
			while (posi != posicion) {
				posi++;
				aux = aux.getNext();
				aux_anterior = aux_anterior.getNext();
			}
			aux_anterior.setDato(aux.getDato());
			aux_anterior.setNext(aux.getNext());
			tamanio--;
		}
	}

	public void deleteFirst() {
		Nodo<T> aux = this.head;
		aux.setDato(head.getNext().getDato());
		aux.setNext(head.getNext().getNext());
		tamanio--;
	}
	//borrar al final
	public void deleteLast() {
		Nodo<T> nuevo = this.head.getNext();
		Nodo<T> aux = this.head;
		while (nuevo.getNext() != null) {
			aux = aux.getNext();
			nuevo = nuevo.getNext();
		}
		aux.setNext(null);
		tamanio--;
	}

	public void search(T valor) {
		Nodo<T> aux = this.head;
		int indice = 0;
		try {
			while (aux.getDato() != valor && aux.getDato() != null) {
				aux = aux.getNext();
				indice++;
			}
			System.out.println("El dato '" + aux.getDato() + "' se encuentra en la posicion: " + indice);
		} catch (Exception e) {
			System.out.println("El dato " + valor + "no ha sido localizado en la lista");
		}
	}

	public void actualizar(T a_buscar, T valor) {
		Nodo<T> aux = this.head;
		try {
			while (aux.getDato() != a_buscar) {
				aux = aux.getNext();
			}
			aux.setDato(valor);
		} catch (Exception e) {
			System.out.println(
					"El dato " + a_buscar + " no ha sido localizado en la lista");
		}
	}

	public void transversal() {
		Nodo<T> aux = this.head;
		while (aux != null) {
			System.out.print(aux);
			aux = aux.getNext();
		}
		System.out.print("\n");
	}

}
