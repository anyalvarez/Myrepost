package arreglos;

public class ArregloMultiEj {

	public static void main(String[] args) {
		int arr[][] = {{2,7,9},{3,6,1},{7,4,2}};
		//la primera es el array y la segunda posicion es dentro de nuestro array.
		//System.out.println(arr[2][1]);
		//System.out.println(arr[0][0]);
		//System.out.println(arr[1][2]);

		
		for (int i =0; i < arr.length; i++) { 
			for(int j = 0 ; j < arr.length; j++){
				System.out.print(arr[i][j] + " "); //print en la misma linea
			}
		}
		
		System.out.println();
	}

}
