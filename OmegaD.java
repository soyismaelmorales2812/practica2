package Clase;

import java.util.Scanner;

public class OmegaD {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
	int N=entrada.nextInt();
	int n=1;
	for (int i = 1; i <=N; i++) {
		for (int j = 1; j <= i; j++) {
			System.out.print(n);
			if(j<i) {
			System.out.print(" ");
			}
		n++;
		}
		if(i<n)
		System.out.println("");
	}
	}
	}