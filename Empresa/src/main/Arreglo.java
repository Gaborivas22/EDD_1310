package main;

import java.util.Arrays;

public class Arreglo {
	int longit;
	Object arr[];

	public Arreglo(int tamanio) {
		longit = tamanio;
		arr = new Object[tamanio];
	}

	public int getLongitud() {
		return longit;
	}

	public void setElemento(int indice, Object objs) {
		arr[indice] = objs;

	}

	public Object getElemento(int indice) {
		return arr[indice];
	}

	public void limpiar(Object objs) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = objs;

		}
	}

	@Override
	public String toString() {
		return "longitud=" + longit + ", arr=" + Arrays.toString(arr) + '}';
	}

}