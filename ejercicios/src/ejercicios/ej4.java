package ejercicios;
import java.util.Scanner;

public class ej4 {
	public static void main(String[] args) {
		while(true) {
			Scanner scanner = new Scanner(System.in);
			System.out.print(" 1. Suma\n 2. Resta\n 3. Multiplicación\n 4. División\n 5. Salir\nIngresá la operación que quieras realizar: ");
			int opcion = scanner.nextInt();
			int num1, num2;
			switch(opcion) {
			case 1:
				System.out.print("Ingresá los numero que quieras sumar: ");
				num1 = scanner.nextInt();
				num2 = scanner.nextInt();
				int sum = num1 + num2;
				System.out.println("La suma da: " + sum);
				break;
			case 2:
				System.out.print("Ingresá los numero que quieras restar: ");
				num1 = scanner.nextInt();
				num2 = scanner.nextInt();
				int resta = num1 - num2;
				System.out.println("La resta da: " + resta);
				break;
			case 3:
				System.out.print("Ingresá los numero que quieras multiplicar: ");
				num1 = scanner.nextInt();
				num2 = scanner.nextInt();
				int mult = num1 * num2;
				System.out.println("La multiplicación da: " + mult);
				break;
			case 4:
				System.out.print("Ingresá los numero que quieras dividir: ");
				num1 = scanner.nextInt();
				num2 = scanner.nextInt();
				float num1f = (float) num1;
				float num2f = (float) num2;
				float div = num1f / num2f;
				System.out.println("La división da: " + div);
				break;
			case 5:
				return;
			default:
				System.out.println("Ingresá una opción válida");
			}
			System.out.println();
		}
		
	}
}