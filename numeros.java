package hola;
import java.util.Scanner;
//import java.util.Scanner;
public class holamundo {
	public static void main(String[] args) {
	 Scanner entrada= new Scanner(System.in);
		System.out.println("PROGRAMA PARA IMPRIMIR NUMEROS");
		System.out.println("=".repeat(20));
		System.out.println("INGRESA EL NUMERO LIMITE PARA IMPRIMIR");
		int num= entrada.nextInt();
		for (int i=1; i<=num; i++) {
			System.out.println(i);
			
		}
		
	}
}
