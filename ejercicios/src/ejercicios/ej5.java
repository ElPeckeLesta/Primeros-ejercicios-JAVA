package ejercicios;
import java.util.Arrays;
import java.util.Scanner;

public class ej5 {
	public static void main(String[] args) {
		while(true) {
			Scanner scanner = new Scanner(System.in);
			System.out.print(" 1. Superheroes de Marvel\n 2. Superheroes de DC\n 3. Superheroes de Disney\n 4. Salir\nIngres� cuales superheroes principales queres saber: ");
			int opcion = scanner.nextInt();
			switch(opcion) {
			case 1:
				System.out.println("Los superheroes de Marvel son:");
				String[] superheroesMarvel = {"Spiderman", "Iron Man", "Capit�n Am�rica", "Thor", "Hulk", "Hawkeye", "Black Widow"};
				for(String superheroe : superheroesMarvel) {
					System.out.println(superheroe);
				}
				
				break;
			case 2:
				System.out.println("Los superheroes de DC son:");
				String[] superheroesDC = {"Flash", "Batman", "Superman", "Wonder Woman", "Linterna verde", "Arrow", "Aquaman"};
				for(String superheroe : superheroesDC) {
					System.out.println(superheroe);
				}
				
				break;
			case 3:
				System.out.println("Los superheroes de Disney son:");
				String[] superheroesDisney = {"Mr Increible", "Helen", "Dash", "Violeta", "Jack Jack", "Frozono", "Hercules"};
				for(String superheroe : superheroesDisney) {
					System.out.println(superheroe);
				}
				break;
			case 4:
				return;
			default:
				System.out.println("Ingres� una opci�n v�lida");
			}
			System.out.println();
		}
	}
}
