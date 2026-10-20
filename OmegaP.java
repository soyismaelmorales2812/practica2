package Clase;

import java.util.Scanner;
import java.util.Arrays;

public class OmegaP {

	public static void main(String[] args) {

				Scanner sc = new Scanner(System.in);
				int n = sc.nextInt();

				int[] arr = new int[n];
				int c = 0;

				arr[c] = n;
				c++;

				while (n != 1) {
					if (n % 2 == 0) {
						n = n / 2;
					} else {
						n = n * 3 + 1;
					}
					arr[c] = n;
					c++;
				}

				Arrays.sort(arr, 0, c);

				for (int i = 0; i < c; i++) {
					System.out.print(arr[i] + " ");
				}

}

}
