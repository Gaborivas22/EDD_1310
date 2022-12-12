package fes.aragon;
import java.util.LinkedHashMap;

public class MainLHM {
	public static void main(String[] args) {
		LinkedHashMap<Integer,String> currents = new LinkedHashMap<Integer,String>();
		
		System.out.println("Prueba del metodo Put");//El metodo put solo agrega los datos al LinkedHashMap
		currents.put(4, "Lando");//Para agregar datos es necesario usar una Key y un Value, en este caso la 
		currents.put(22, "Yuki");//key es el numero favorito de los nombres introducidos en el value
		currents.put(30, "Cami");
		currents.put(77, "Varelita");
		currents.put(5,"Vettel");
		currents.put(11,"Checo");
		System.out.println(currents);//Imprimimos el mapa para asegurarnos que los valores fueron agregados
									 //correctamente
		
		System.out.println("\nPrueba del metodo Get");//El metodo get funciona regresando el valor asociado 
		System.out.println(currents.get(22));		  //a la llave(Key)
		
		System.out.println("\nPrueba del metodo Replace");//Este metodo funciona remplazando el valor 
		currents.replace(22, "Gabo");					  //mediante la llave	
		System.out.println(currents.get(22));
		
		System.out.println("\nPrueba del metodo ContainsKey");//Este metodo comprueba si existe la llave 
		System.out.println(currents.containsKey(11));//dentro del mapa y nos regresa un booleano True en
		System.out.println(currents.containsKey(12));//caso de que exista la llave
		
		System.out.println("\nPrueba del metodo ContainsValue");//Este metodo comprueba si existe el valor
		System.out.println(currents.containsValue("Vettel"));//dentro del mapa y nos regresa un booleano 
		System.out.println(currents.containsValue("Gasly"));//True en caso de que exista el valor
		
		System.out.println("\nPrueba del metodo KeySet");//Este metodo nos devuelve una lista con 
		for(Integer indice:currents.keySet()) {//todos True en caso de que exista el valor
			System.out.println(currents.get(indice));
		}
		
		System.out.println("\nprueba del metodo Size");//Mediante este metodo podemos obtener
		System.out.println(currents.size());//el tamaño de nuestro LinkedHashMap
		
		System.out.println("\nPrueba del metodo Clone");//Atraves de este metodo podemos clonar 
		Object currents2=currents.clone();//el LinkedHashMap y almacenarlo como un objeto
		System.out.println(currents2);
		
		System.out.println("\nPrueba del metodo Remove");//Este metodo elimina el value mediante  
		System.out.println(currents.remove(77));//El key al imprimirlo nos muestra el valor que 
		System.out.println(currents);//elimino
		
		System.out.println("\nPrueba del metodo Clear");//El metodo clear elimina todo el 
		currents.clear();//contenido del LinkedHashMap
		System.out.println(currents);//Al impimir el LinkedHashMap nos podemos dar cuenta
									 //que se encuentra vacio
		
		System.out.println("\nPrueba del metodo IsEmpty");//Este metodo nos regresa un booleano
		System.out.println(currents.isEmpty()); 		  //dependiendo si esta vacio o lleno
		
	}

}
