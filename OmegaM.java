package Clase;

import java.util.Scanner;

public class OmegaM {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int[] arreglo = new int[n];
		for (int i = 0; i < n; i++) {
			arreglo[i] = in.nextInt();
		}
		int k = in.nextInt();
		for (int i = k; i < n; i++) {
			System.out.print(arreglo[i]);
			if (i < n - 1) {
				System.out.print(" ");
			}
		}
	}
}
