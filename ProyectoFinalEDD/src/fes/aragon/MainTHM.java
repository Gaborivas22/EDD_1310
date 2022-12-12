package fes.aragon;

import java.util.TreeMap;

public class MainTHM {
	public static void main(String[] args) {
		TreeMap<Integer,String> lonerism = new TreeMap<Integer,String>();
		
		System.out.println("Prueba del metodo Put");//El metodo put solo agrega los datos al TreeMap
		lonerism.put(29, "Denimon");//Para agregar datos es necesario usar una Key y un Value, en este caso  
		lonerism.put(22, "Gabo");//la key es el numero favorito de los nombres introducidos en el value
		lonerism.put(4, "Cami");
		lonerism.put(77, "Varelita");
		System.out.println(lonerism);//Imprimimos el mapa para asegurarnos que los valores fueron agregados 
									 //correctamente
		
		System.out.println("\nPrueba del metodo Get");//El metodo get funciona regresando el valor asociado 
		System.out.println(lonerism.get(4));//a la llave(Key)
		
		System.out.println("\nPrueba del metodo Replace");//Este metodo funciona remplazando el valor mediante 
		lonerism.replace(77, "Varelota");//la llave
		System.out.println(lonerism.get(77));
		
		System.out.println("\nPrueba del metodo ContainsKey");//Este metodo comprueba si existe la llave dentro 
		System.out.println(lonerism.containsKey(29));//del mapa y nos regresa un booleano True en caso de que 
		System.out.println(lonerism.containsKey(12));//exista la llave
		
		System.out.println("\nPrueba del metodo ContainsValue");//Este metodo comprueba si existe el valor 
		System.out.println(lonerism.containsValue("Denimon"));//dentro del mapa y nos regresa un booleano 
		System.out.println(lonerism.containsValue("Santy"));//True en caso de que exista el valor
		
		System.out.println("\nPrueba del metodo KeySet");//Este metodo nos devuelve una lista con todos 
		for(Integer indice:lonerism.keySet()) {          //los valores sin las llaves
			System.out.println(lonerism.get(indice));
		}
		
		System.out.println("\nPrueba del metodo FirstKey");//Este metodo devuelve la primer llave 
		System.out.println(lonerism.firstKey());		   //dentro del TreeMap
		
		System.out.println("\nPrueba del metodo FirstEntry");//Este metodo nos devuelve el primer par
		System.out.println(lonerism.firstEntry());		     //de llave valor del TreeMap
		
		System.out.println("\nPrueba del metodo LastKey");//Este metodo devuelve la ultima llave 
		System.out.println(lonerism.lastKey());			  //dentro del TreeMap
		
		System.out.println("\nPrueba del metodo LastEntry");//Este metodo devuelve el ultimo par 
		System.out.println(lonerism.lastEntry());		    //llave valor dentro del TreeMap
		
		System.out.println("\nPrueba del metodo HigherKey");//Este metodo nos devuelve la siguente  
		System.out.println(lonerism.higherKey(4));          //llave despues de la llave ingresada
		
		System.out.println("\nPrueba del metodo LowerKey");//Este metodo nos regresa la llave 
		System.out.println(lonerism.lowerKey(22));		   //anterior a la llave ingresada
		
		System.out.println("\nPrueba del metodo HigherEntry");//Este metodo nos devuelve la siguente 
		System.out.println(lonerism.higherEntry(29));//llave junto a su valor despues de la llave
													 //ingresada
		
		System.out.println("\nPrueba del metodo LowerEntry");//Este metodo nos devuelve la llave junto  
		System.out.println(lonerism.lowerEntry(29));//a su valor anterior de la llave ingresada
		
		System.out.println("\nPrueba del metodo Size");//Mediante este metodo podemos obtener el tamaño
		System.out.println(lonerism.size());		   //de nuestro TreeMap
		
		System.out.println("\nPrueba del metodo Clone");//Atraves de este metodo podemos clonar el TreeMap
		Object lonerism2=lonerism.clone();				// y almacenarlo como un objeto
		System.out.println(lonerism2);
		
		System.out.println("\nPrueba del metodo Remove");//Este metodo elimina el value mediante el key 
		System.out.println(lonerism.remove(77));//al imprimirlo nos muestra el valor que elimino
		System.out.println(lonerism);
		
		System.out.println("\nPrueba del metodo Clear");//El metodo clear elimina todo el contenido del TreeMap
		lonerism.clear();
		System.out.println(lonerism);//Al impimir el TreeMap nos podemos dar cuenta que se encuentra vacio
		
		System.out.println("\nPrueba del metodo IsEmpty");//Este metodo nos regresa un booleano dependiendo 
		System.out.println(lonerism.isEmpty());//si esta vacio o lleno nuestro TreeMap
		
	}
}