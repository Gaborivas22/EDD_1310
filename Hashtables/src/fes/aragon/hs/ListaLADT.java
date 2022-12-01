package fes.aragon.hs;

import java.util.Iterator;

public class ListaLADT<T> implements Iterable<T> {
    @SuppressWarnings("hiding")
	private class Nodo<T> {
        public T valor;
        public Nodo<T> siguiente;
    }

    private Nodo<T> head;

    public ListaLADT() {}
    
    public void agregarAlPrincipio(T valorAAgregar) {
        Nodo<T> newNode = new Nodo<>();
        newNode.valor = valorAAgregar;
        newNode.siguiente = head;
        head = newNode;
    }

    public void agregarAlFinal(T valorAAgregar) {
        if(!estaVacia()) {
            Nodo<T> current = head;
            while (current.siguiente != null) {
                current = current.siguiente;
            }
            Nodo<T> newNode = new Nodo<>();
            newNode.valor = valorAAgregar;
            current.siguiente = newNode;
        } else {
        	agregarAlPrincipio(valorAAgregar);
        }
    }
    
    public void borrarPrimero() {
        if (!estaVacia()) {
            head = head.siguiente;
        }
    }

    public ListaLADT(T ValorInicial) {
        head = new Nodo<>();
        head.valor = ValorInicial;
    }

    public boolean tiene(T valorABuscar) {
        Nodo<T> current = head;
        while (current != null) {
            if (valorABuscar.equals(current.valor)){
                return true;
            }
            current = current.siguiente;
        }
        return false;
    }
    
    public boolean estaVacia() {
        return head == null;
    }
    
    public void buscarYBorrar(T valorABorrar) {
        if (!tiene(valorABorrar))
            return;
        Nodo<T> prev = null;
        Nodo<T> curr = head;
        while (curr != null && !valorABorrar.equals(curr.valor)) {
            prev = curr;
            curr = curr.siguiente;
        }
        if (curr == head) {
            borrarPrimero();
            return;
        }
        prev.siguiente = curr.siguiente;
    }
    
    public void actualizar(T valorAActualizar, T valorARemplazar) {
        Nodo<T> current = head;
        while (current != null) {
            if (valorAActualizar.equals(current.valor)){
                current.valor = valorARemplazar;
                return;
            }
            current = current.siguiente;
        }
    }

    public String toString(){
        String resultado = "";
        Nodo<T> current = head;
        while (current != null) {
            resultado += current.valor + " -> ";
            current = current.siguiente;
        }
        resultado += "null";
        return resultado;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            Nodo<T> current = head;
            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                T value = current.valor;
                current = current.siguiente;
                return value;
            }
        };
    }
}