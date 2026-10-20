package Clase;
import java.util.Scanner;
public class OmegaH {

	public static void main(String[] args) {
		Scanner an = new Scanner(System.in);
		int a = an.nextInt();
		int b = an.nextInt();
		int c = an.nextInt();

		int totalj = a + b + c;

		int A = an.nextInt();
		int B = an.nextInt();
		int totalp = A + B;

		if (totalj > totalp) {
			System.out.println("Juan");
		} else {
			System.out.println("Pedro");
		}

	}

}
