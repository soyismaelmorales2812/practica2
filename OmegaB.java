package Clase;

import java.util.Scanner;

public class OmegaB {

	public static void main(String[] args) {
		Scanner an = new Scanner(System.in);
		int dia = an.nextInt();
		int mes = an.nextInt();
		if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {

			System.out.println("Acuario");
			System.out.println("Invierno");

		} else if ((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)) {

			System.out.println("Piscis");
			System.out.println("Invierno");

		} else if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {

			System.out.println("Aries");
			System.out.println("Primavera");

		} else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
			System.out.println("Tauro");
			System.out.println("Primavera");

		} else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
			System.out.println("Geminis");
			System.out.println("Primavera");

		} else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
			System.out.println("Cancer");
			System.out.println("Verano");

		} else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
			System.out.println("Leo");
			System.out.println("Verano");

		} else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
			System.out.println("Virgo");
			System.out.println("Verano");

		} else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
			System.out.println("Libra");
			System.out.println("Otono");

		} else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
			System.out.println("Escorpion");
			System.out.println("Otono");

		} else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
			System.out.println("Sagitario");
			System.out.println("Otono");

		} else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 21)) {
			System.out.println("Capricornio");
			System.out.println("Invierno");

		}
	}
}