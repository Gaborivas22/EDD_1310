package fes.aragon.pila;

public class PilaMain {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		PilaADT pila = new PilaADT();

		//Verificamos que la pila se encuentre vacia
		System.out.println(pila.isEmpty());
		
		//Probamos el metodo pop que al no tener datos nos arrojara una excepcion
		pila.pop();
		
		//Repetimos lo mismo con el metodo peek
		pila.peek();
		
		//Agregamos el primer dato
		pila.push("Un arbol color sodio");
		
		//Checamos lo que esta dentro de la pila
		System.out.println(pila);
		
		//Agregamos mas datos
		pila.push("Nube ditoxica sin direccion");
		pila.push("Luna Roja es peligrosa");
		pila.push("De trampas se hizo la ley");
		pila.push("Estoy bailando una danza rota");
		
		//Probamos si nos devuelve el tamaño
		System.out.println(pila.length());
		
		//Checamos como esta nuestro arreglo
		System.out.println(pila);
		
		//Probamos el metodo pop con datos
		System.out.println(pila.pop());
		
		//probamos el metodo peek con datos
		System.out.println(pila.peek());
		
		//Volvemos a probar si esta vacia
		System.out.println(pila.isEmpty());
		
		//Pedimos de nuevo la pila para comprobar que este correcta
		System.out.println(pila);
		
	}
}
