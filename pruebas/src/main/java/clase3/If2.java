package clase3;

import java.util.Scanner;

public class If2 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		//ingrese contrase�a y usuario
		// si contrase�a es igual a "1234"  y usuario = admin => "ok" (SE NECESITAN DOS VARIABLES)
		// de lo contrario "fail"
		
		String usuario;
		String contrasenia;
		
		//ASIGNAR
		usuario="jose";
		contrasenia="1234";
		
		//condiciones
		if (usuario == "admin" && contrasenia == "1234") {     //TODO LO QUE HAY AQUI ES ERDADERO
			System.out.println("ok");
		}else {
			System.out.println("fail");
		}
		
		//forma anidada
		if(usuario=="admin") {
			if(contrasenia=="1234") {
				System.out.println("ok");
			}else {
				System.err.println("fail");
			}
			}else {
				System.err.println("fail");
				
		}
		
		
		
		
	}

}