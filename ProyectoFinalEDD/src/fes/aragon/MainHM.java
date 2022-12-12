package fes.aragon;

import java.util.HashMap;

public class MainHM {
	public static void main(String[] args) {
		HashMap<Integer,String> innerspeaker = new HashMap<Integer,String>();
		
		System.out.println("Prueba del metodo Put");//El metodo put solo agrega los datos al HashMap
		innerspeaker.put(5, "Kevin");//Para agregar datos es necesario usar una Key y un Value, en este caso la 
		innerspeaker.put(22, "Gabo");//key es el numero favorito de los nombres introducidos en el value
		innerspeaker.put(30, "Cami");
		innerspeaker.put(7, "Pond");
		innerspeaker.put(4,"Impala");
		innerspeaker.put(11,"Elephant");
		System.out.println(innerspeaker);//Imprimimos el HashMap para asegurarnos que los valores fueron agregados 
										 //correctamente
		
		System.out.println("\nPrueba del metodo Get");//El metodo get funciona regresando el valor asociado 
		System.out.println(innerspeaker.get(22));//a la llave(Key)
		
		System.out.println("\nPrueba del metodo Replace");//Este metodo funciona remplazando el valor mediante la llave
		innerspeaker.replace(22, "NotGabo");
		System.out.println(innerspeaker.get(22));
		
		System.out.println("\nPrueba del metodo ContainsKey");//Este metodo comprueba si existe la llave dentro del mapa 
		System.out.println(innerspeaker.containsKey(11));//y nos regresa un booleano True en caso de que exista la llave
		System.out.println(innerspeaker.containsKey(12));//y un false en caso de que no exista dicha llave
		
		System.out.println("\nPrueba del metodo ContainsValue");//Este metodo comprueba si existe el valor dentro del mapa 
		System.out.println(innerspeaker.containsValue("Impala"));//y nos regresa un booleano True en caso de que exista el 
		System.out.println(innerspeaker.containsValue("Gasly"));//valor y un false en caso de que no exista dicho valor
		
		System.out.println("\nPrueba del metodo KeySet");//Este metodo nos devuelve una lista con todos los valores 
		for(Integer indice:innerspeaker.keySet()) { //sin las llaves
			System.out.println(innerspeaker.get(indice));
		}
		
		System.out.println("\nPrueba del metodo Size");//Mediante este metodo podemos obtener el tamaño de nuestro 
		System.out.println(innerspeaker.size());//HashMap
		
		System.out.println("\nPrueba del metodo Clone");//Atraves de este metodo podemos clonar el HashMap y  
		Object innerspeaker2=innerspeaker.clone();//almacenarlo como un objeto
		System.out.println(innerspeaker2);
		
		System.out.println("\nPrueba del metodo Merge");//Mediante este metodo podemos unir dos HashMap en uno solo
		HashMap<Integer, String> innerspeakerB = new HashMap<>();
		innerspeakerB.put(5, "Kevin2");
		innerspeaker.put(30, "Cami2");
		innerspeakerB.put(22, "Gabo2");
		innerspeakerB.put(7, "Pond2");
		innerspeakerB.put(4,"Impala2");
		innerspeakerB.put(11,"Elephant2");
		
		innerspeaker.forEach((key, value) -> 
		innerspeakerB.merge(key,value,(v1, v2) -> v1.equalsIgnoreCase(v2)
                            ? v1
                            : v1 + ", " + v2));
		System.out.println("Mezcla de ambos: " + innerspeakerB);
		
		
		System.out.println("\nPrueba del metodo Remove");//Este metodo elimina el value mediante el key 
		System.out.println(innerspeaker.remove(7));//al imprimirlo nos muestra el valor que elimino y en caso  
		System.out.println(innerspeaker.remove(71));//de que no exista el valor muestra un null
		System.out.println(innerspeaker);
		
		System.out.println("\nPrueba del metodo clear");//El metodo clear elimina todo el contenido del HashMap
		innerspeaker.clear();
		System.out.println(innerspeaker);//Al impimir el HashMap nos podemos dar cuenta que se encuentra vacio
		
		System.out.println("\nPrueba del metodo IsEmpty");//Este metodo nos regresa un booleano dependiendo 
		System.out.println(innerspeaker.isEmpty());//si esta vacio o lleno
	}

}
