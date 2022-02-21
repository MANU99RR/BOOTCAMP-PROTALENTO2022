package pruebas;

public class Ejercicio1 {

	public static void main(String[] args) {
       //(variableA && variableB) || (variableA && variableC) = true
//		   true     && true            true     &&    true    = true
//         false    &&  true           false    &&    false     falsex
//         true         false          true           true       true
	
		
		boolean a =false;
		boolean b =false;
		boolean c = a && b;
		System.out.println(c ? 1 : 0);
		
		//operador ternario
		int r = (c ? 1 : 0);
		
		 
		
		
	}

}
