package beecrowd;

import java.util.Scanner;

public class problema_1066 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int par = 0;
		int impar = 0;
		int positivo = 0;
		int negativo = 0;
		
		
		for (int i = 0; i < 5; i++) {
			int N = sc.nextInt();
			boolean checaPar = N % 2 == 0;
			
			if (checaPar) {
				par++;
				if (N > 0) {
					positivo ++;
				}
				else if (N < 0){
					negativo++;
				}
			}
			else {
				impar++;
				if (N > 0) {
					positivo++;
				}
				else if (N < 0){
					negativo++;
				}
			}
		}
		System.out.printf("PAR: %d%n", par);
		System.out.printf("IMPAR: %d%n", impar);
		System.out.printf("POSITIVO: %d%n", positivo);
		System.out.printf("NEGATIVO: %d%n", negativo);
		
		sc.close();

	}

}
