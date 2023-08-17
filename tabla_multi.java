package hola;
import java.util.Scanner;
//import java.util.Scanner;
//TABLA DE MULTIPLICACION
public class holamundo {
	public static void main(String[] args) {
	 Scanner entrada= new Scanner(System.in);
		System.out.println("PROGRAMA PARA IMPRIMIR NUMEROS");
		System.out.println("=".repeat(20));
		System.out.print("DE QUE NUMERO QUIERES: ");
		int num= entrada.nextInt();
		for (int i=1; i<=12; i++) {
			
			System.out.println(num + "×" + i + "=" + i*num);
			
		}
		
	}
}
