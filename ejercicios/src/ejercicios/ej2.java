package ejercicios;

public class ej2 {
	public static void main(String[] args) {
		for(int i = 50; i <= 100; i++) {
			boolean esPrimo = true;
			for(int j = 2; j <= i/2; j++) {
				if(i % j == 0) {
					esPrimo = false;
					break;
				}
			}
			if(esPrimo) {
				System.out.print(i + " es primo");
			}
			else {
				System.out.print(i + " no es primo, divisible por ");
				for(int j = 2; j <= i/2; j++) {
					if(i % j == 0) {
						System.out.print(j + ", ");
					}
				}
			}
			System.out.print("\n");
		}
	}
}
