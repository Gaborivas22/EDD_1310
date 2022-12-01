package fes.aragon.hs;

public class Main {
    public static void main(String[] args) {
    	HashtablesSeparateChaining<String, String> comidaFav = new HashtablesSeparateChaining<>();
    	//agregamos datos
    	comidaFav.add("Gabo", "tacos");
    	comidaFav.add("Juanito","Pizza");
    	comidaFav.add("Pedro","Arepas");

    	//probamos si puede eliminar el dato
        comidaFav.remove("Gabo");
        System.out.println(comidaFav.valueOf("Gabo"));
    
        //probamos si el metodo regresa el valor de la llave
        System.out.println(comidaFav.valueOf("Pedro"));
        
    }
}
