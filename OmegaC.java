package Clase;

import java.util.Scanner;

public class OmegaC {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int N = entrada.nextInt();
		int numeros[] = new int[N];
		for (int i = 0; i < N; i++) {
			numeros[i] = entrada.nextInt();
		}
		int H = 0;
		for (int i = 0; i < N; i++) {
			if (numeros[i] == 8) {
				H = 1;
			}
		}
		System.out.println(H);
	}
}
