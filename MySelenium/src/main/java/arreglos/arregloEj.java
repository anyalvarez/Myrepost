package arreglos;

public class arregloEj {

	public static void main(String[] args) {
		int intArray[];
		int [] intArray2;
		
		short shortArray [];
		String array[]; //declaracion de array
		
		array= new String[5];//asignando memoria para 5 strings
		
		array[0] = "Cero";
		array[1] = "Uno";
		array[2] = "Dos";
		array[3] = "Tres";
		array[4] = "Cuatro";
		
		
		System.out.println("Elemento de la posicion 1:" + array[1]);
		System.out.println("Elemento de la posicion 3:" + array[3]);
		
		for ( int i =0; i< array.length; i++) {
			System.out.println("Elemento en el indice:" + i + ":" + array[i]);
		}

	}

}
