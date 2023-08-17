package hola;
import java.util.Scanner;
//import java.util.Scanner;
/* Crea un programa que pida al usuario que ingrese un número y
luego imprima todos los números primos menores que ese número. */
public class holamundo {
public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
System.out.println("PROGRAMA PARA IMPRIMIR NÚMEROS PRIMOS MENORES");
System.out.println("=".repeat(20));
System.out.print("NÚMERO MÁXIMO: ");
int num = entrada.nextInt();
for (int i = 2; i < num; i++) {
if (esPrimo(i)) {
System.out.println(i);
}
}
}
static boolean esPrimo(int num) {
if (num <= 1) {
return false;
}
for (int i = 2; i <= Math.sqrt(num); i++) {
if (num % i == 0) {
return false;
}
}
return true;
}
}
