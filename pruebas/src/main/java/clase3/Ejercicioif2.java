package clase3;

public class Ejercicioif2 {

	public static void main(String[] args) {
		// Determinar dado tres numeros, cual es el mayor 
		
		//CUANTAS VARIABLES NECESITO? SE NECESITAN 3 VARIABLES 
		//3 VARIABLES
		//if
		//mostrar
		
		double a,b,c;
		a = 11;
		b = 11.2;
		c = 10;
				
		//a > b y a > c caso1
		//b > a y b > c caso2
		//c > b y c > a caso3
		//a == b y a == c
		
		if (a > b && a > c) {
			System.out.println(a + "es mayor");
		}
		if (b > a && b > c) {
			System.out.println(b + "es mayor");
		}
		if (c > a && b > c) {
			System.out.println(c + "es mayor");
		}
		if (a == b && a == c) {
			System.out.println(a+","+ b +","+ c + "son iguales" );
		}
	}

}
