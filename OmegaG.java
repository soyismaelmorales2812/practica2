package Clase;

import java.util.Iterator;
import java.util.Scanner;

public class OmegaG {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int N = entrada.nextInt();
		int[] n=new int[N];
		for (int i = 0; i < N; i++) {
			n[i]=entrada.nextInt();
		}
		int M=n[0];
		for (int i = 0; i < N; i++) {
			if(n[i]>M) {
				M=n[i];
				
			}
		}
		System.out.println(M);

	}

}
