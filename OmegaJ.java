package Clase;
import java.util.Scanner;
public class OmegaJ {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int n = entrada.nextInt();
		int k = entrada.nextInt();
		int a1 = 0;

		for (int i = 0; i < n; i++) {
			int a = entrada.nextInt();
			if (a == k) {
				a1++;
			}
		}

		System.out.println(a1);

	}

}
