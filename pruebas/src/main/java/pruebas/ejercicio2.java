package pruebas;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		
		//ahora puedo leer datos desde el teclado 
		//f5, f6,f7,f8


		int a  = teclado.nextInt(); //leer un dato entero
		
		System.out.println("ingrese el valor de b:");
		int b =  teclado.nextInt();
		
		int suma = a + b;
		
		System.out.println("la suma es="+ suma);
		
		//CIERRO EL TECLADO f8
		teclado.close();
		
		
		
	}

}
