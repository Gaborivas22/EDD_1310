/*Autor: Gabriel Rivas Maldonado
   Estructura de Datos
   Grupo: 1310*/

package fes.aragon.edd;

public class Array {
	private int tamanio;
	private int longitud;
	private int elemento;
	private String valor;
	private int indice;
	
	public Array(int tamanio, int longitud, int elemento) {
		this.tamanio = tamanio;
		this.longitud = longitud;
		this.elemento = elemento;
	}
	
	public int getLongitud() {
		return tamanio;
	}
	
	public int getElemento(int indice) {
		return elemento;
	}
	
	public void setElemento(int indice, String valor) {
		this.indice = indice;
        this.valor = valor;
	}
	
	public void limpiar (String valor){     
    }
	
	@Override
	public String toString() {
		return "Arreglo [" + "tama\u00f1o: " + tamanio + ", longitud:" + longitud + ", elemento:" + elemento + ']';
	}
}
