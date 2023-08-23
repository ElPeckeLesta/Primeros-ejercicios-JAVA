package ejercicios;
import java.util.Scanner;

public class ej3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingresá todos los números que quieras: ");
		while(true) {
			int n = scanner.nextInt();
			System.out.print(n-10);
			if(n > 100) {
				boolean esPrimo = true;
				for(int i = 2; i <= n/2; i++) {
					if(n % i == 0) {
						esPrimo = false;
						break;
					}
				}
				if(esPrimo) return;
			}
		}
	}

}
