package fes.aragon.listas;

public class ListaLADT<T> {
	Nodo<T> head;
	int length;
	public ListaLADT() {
	}
	public void mostrarVert() {
		Nodo<T> aux = this.head;
		while (aux != null) {
			System.out.print(aux);
			aux = aux.getNext();
		}
		System.out.print("\n");
	}
	public int getLength() {
		System.out.println("El tama\u00f1o de nuestra lista es: " + this.length);
		return this.length;
	}
	public void addFirst(T valor) {
		if (this.head == null) {
			head = new Nodo<>(valor);
		} else {
			Nodo<T> new1 = new Nodo<T>(valor);
			new1.setNext(head);
			head = new1;
			length++;
		}
	}
	public void addLast(T valor) {
		if (this.head == null) {
			head = new Nodo<>(valor);
		} else {
			Nodo<T> new2 = new Nodo<T>(valor);
			Nodo<T> aux = this.head;
			while (aux.getNext() != null) {
				aux = aux.getNext();
			}
			aux.setNext(new2);
			length++;
		}
	}
	public void addAt(T referencia, T valor) {
		if (this.head == null) {
			System.out.println("La lista se encuentra vacia");
			head = new Nodo<>(valor);
		} else {
			Nodo<T> new2 = new Nodo<T>(valor);
			Nodo<T> aux = this.head;
			Nodo<T> auxi = this.head.getNext();
			while (aux.getDato() != referencia) {
				aux = aux.getNext();
				auxi = auxi.getNext();
			}
			aux.setNext(new2);
			aux.getNext().setNext(auxi);
			length++;
		}
	}
	public boolean isEmpty() {
		System.out.println(this.head == null);
		return this.head == null;
	}
	public void delete(int pos1) {
		int pos = 0;
		if (head == null) {
			System.out.println("La lista se encuentra vacia, no es posible borrar un elemento");
		} else {
			Nodo<T> auxante = this.head;
			Nodo<T> aux = this.head.getNext();
			while (pos != pos1) {
				pos++;
				aux = aux.getNext();
				auxante = auxante.getNext();
			}
			auxante.setDato(aux.getDato());
			auxante.setNext(aux.getNext());
			length--;
		}
	}
	public void deleteFirst() {
		Nodo<T> aux1 = this.head;
		aux1.setDato(head.getNext().getDato());
		aux1.setNext(head.getNext().getNext());
		length--;
	}
	public void deleteLast() {
		Nodo<T> nuevo1 = this.head.getNext();
		Nodo<T> aux2 = this.head;
		while (nuevo1.getNext() != null) {
			aux2 = aux2.getNext();
			nuevo1 = nuevo1.getNext();
		}
		aux2.setNext(null);
		length--;
	}
	public void search(T valor) {
		Nodo<T> aux = this.head;
		int indice = 0;
		try {
			while (aux.getDato() != valor && aux.getDato() != null) {
				aux = aux.getNext();
				indice++;
			}
			System.out.println("El dato " + aux.getDato() + " se encuentra en la posicion: " + indice);
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
					"El dato " + a_buscar + " para su actualizacion, no ha sido localizado en la lista");
		}
	}
