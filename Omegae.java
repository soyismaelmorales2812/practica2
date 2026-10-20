package Clase;
import java.util.Scanner;
public class Omegae {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int N=entrada.nextInt();
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N-i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <=2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
