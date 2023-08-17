package hola;
import java.util.Scanner;
//import java.util.Scanner;
public class holamundo {
	public static void main(String[] args) {
	 Scanner entrada= new Scanner(System.in);
		System.out.println("Hola este es mi primer programa en java");
		System.out.println("PROGRAMA DE SUMAS");
		System.out.println("=".repeat(20));
		
		int num1= entrada.nextInt();
		int num2= entrada.nextInt();
		
		System.out.println("La suma es: " + (num1+ num2));
	}
}

