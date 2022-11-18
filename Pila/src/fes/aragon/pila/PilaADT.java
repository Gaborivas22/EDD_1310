package fes.aragon.pila;

import java.util.ArrayList;

public class PilaADT<T> {
	ArrayList<T> arlPila = new ArrayList<>();
	int tam, top = 0;

	public PilaADT() {
	}
	
	@Override
	public String toString() {
		return "Tu pila creada es " + arlPila + " :D";
	}
	
	public int length() {
		return this.tam;
	}

	public boolean isEmpty() {
		return this.tam == 0;
	}

	public void push(T dato) {
		arlPila.add(top, dato);
		this.top++;
		this.tam++;
	}
	
	public T pop() {
		T delete = null;
		if (!isEmpty()) {
			//T delete = null;
			System.out.print("El dato eliminado fue: ");
			delete = arlPila.remove(top-1);
			this.tam=tam-1;
			this.top=top-1;
		} else {
			System.out.println("La Pila se encuentra vacia :c, agrega datos para poder usar el metodo");
		}
		//T delete = null;
		return delete;
	}

	public T peek() {
		T check = null;
		if (!isEmpty()) {
			//T check = null;
			System.out.print("El dato del tope consultado es: ");
			check = arlPila.get(top-1);
		} else {
			System.out.println("La Pila esta vacia :(, si deseas usar este metodo agrega datos");
		}
		//T check = null;
		return check;
	}
}

