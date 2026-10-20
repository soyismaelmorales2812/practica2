package Clase;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class OmegaI {

	

	public class OmegaI1 {

		static final int MAX_VAL = 1000000;

		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer("");

			String line = br.readLine();
			if (line == null)
				return;

			st = new StringTokenizer(line);
			if (!st.hasMoreTokens())
				return;

			int n = Integer.parseInt(st.nextToken());
			int[] freq = new int[MAX_VAL + 1];

			
			int countRead = 0;
			while (countRead < n) {
				while (!st.hasMoreTokens()) {
					line = br.readLine();
					if (line == null)
						break;
					st = new StringTokenizer(line);
				}
				if (line == null)
					break;
				int x = Integer.parseInt(st.nextToken());
				freq[x]++;
				countRead++;
			}

			
			for (int g = MAX_VAL; g >= 1; g--) {
				long firstMax = -1;
				long secondMax = -1;
				int totalMultiples = 0;

				
				for (int m = (MAX_VAL / g) * g; m >= g; m -= g) {
					if (freq[m] > 0) {
						int available = freq[m];
						for (int c = 0; c < available; c++) {
							if (firstMax == -1) {
								firstMax = m;
							} else if (secondMax == -1) {
								secondMax = m;
							}
							totalMultiples++;
							if (totalMultiples >= 2)
								break;
						}
					}
					if (totalMultiples >= 2)
						break;
				}

				if (totalMultiples >= 2) {
					long maxMcm = (firstMax / g) * secondMax;
					System.out.println(maxMcm);
					return;
				}}}}}
