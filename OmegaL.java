package Clase;

import java.util.Scanner;

public class OmegaL {

	public static void main(String[] args) {
				Scanner in = new Scanner(System.in);

				int n = in.nextInt();

				int[] a = new int[n];
				for (int i = 0; i < n; i++) {
					a[i] = in.nextInt();
				}

				int[] b = new int[n];
				for (int i = 0; i < n; i++) {
					b[i] = in.nextInt();
				}

				int suma= 0;
				for (int i = 0; i < n; i++) {
					suma = suma + (a[i] * b[i]);
				}

				System.out.println(suma);

			
			}

		

}

