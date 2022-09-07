package main;

import java.io.BufferedReader;
import java.io.FileReader;

public class Empresa {

	public static void main(String[] args) {
		try {

			BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\Gabriel\\Downloads\\Junio.dat"));
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Gabriel\\Downloads\\Junio.dat"));
			Object objs, objs2;
			String linea;
			int head, filas, mayor, menor;
			mayor = menor = head = filas = 0;

			while ((linea = bf.readLine()) != null) {

				filas++;
			}
			Arreglo arr = new Arreglo(filas - 2);
			while ((linea = br.readLine()) != null) {

				if (head > 0 & head < 14) {

					String sp1[] = linea.split(",");

					Trabajador trab = new Trabajador(Integer.parseInt(sp1[0]), sp1[1], sp1[2], sp1[3],
							Integer.parseInt(sp1[4]), Float.parseFloat(sp1[5]), Integer.parseInt(sp1[6]));
					arr.setElemento(head - 1, trab);
					System.out.println(arr.getElemento(head - 1));

				}
				head++;
			}

			for (int i = 0; i < arr.getLongitud() - 1; i++) {
				objs = arr.getElemento(i);
				objs2 = arr.getElemento(i + 1);

				if (i == 0) {
					mayor = menor = ((Trabajador) objs).getAnoIngreso();

				}
				if (mayor < ((Trabajador) objs2).getAnoIngreso()) {
					mayor = ((Trabajador) objs2).getAnoIngreso();

				}

				if (menor > ((Trabajador) objs2).getAnoIngreso()) {
					menor = ((Trabajador) objs2).getAnoIngreso();

				}

			}
			System.out.println(
					"\nEl empleado con mayor antiguedad empezo a trabajar en: " + menor + "\nEl empleado con menor antiguedad empezo a trabajar en: " + mayor);

		} catch (Exception e) {
			System.out.println();

			System.out.println("Exepcion");
			return;
		}

	}
}