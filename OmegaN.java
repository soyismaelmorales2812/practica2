package Clase;

import java.util.Scanner;

public class OmegaN {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int N=entrada.nextInt();
		int A[]=new int[N];
		for (int i = 0; i < N; i++) {
			A[i]=entrada.nextInt();
		}
		int K=entrada.nextInt();
		for (int i = 0; i < N-K; i++) {
			System.out.print(A[i]);
			if(i<N-K-1) {
				System.out.print(" ");
			}
		}
				

	}

}
