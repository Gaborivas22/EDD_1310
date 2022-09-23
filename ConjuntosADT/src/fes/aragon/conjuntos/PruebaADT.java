package fes.aragon.conjuntos;

import java.util.HashSet;
import java.util.Iterator;

public class PruebaADT {
	public static void main(String[] args) {
		// TODO code application logic here

		HashSet<ADT> union, interseccion, diferencia;

		ADT<Integer> ola = new ADT<>();
		HashSet<Integer> chao = new HashSet<>();

		ola.agregarDato(1);
		ola.agregarDato(7);
		ola.agregarDato(69);
		ola.agregarDato(22);
		ola.agregarDato(420);

		System.out.println(ola);

		ola.getLongitud();

		System.out.println("¿Se encuentra dentro del conjunto?");
		ola.contiene(18);

		ola.eliminarDato(22);
		System.out.println("El numero 22 ha sido eliminado");
		System.out.println(ola);

		chao.add(12);
		chao.add(11);
		chao.add(65);
		chao.add(150);

		System.out.println("¿Es igual?");
		ola.esIgual(chao);

		System.out.println("¿Es un SubConjunto?");
		ola.esSubConjunto(chao);

		System.out.println("¿Cual es la unión de los conjuntos?");
		ola.union(chao);

		System.out.println("¿Cual es su intersección?");
		ola.interseccion(chao);

		System.out.println("¿Cual es su diferencia?");
		ola.diferencia(chao);

		System.out.println("¿Cual es el Iterador?");
		ola.iterador();
		
		System.out.println("Chao gracias :DDD");

	}

}
