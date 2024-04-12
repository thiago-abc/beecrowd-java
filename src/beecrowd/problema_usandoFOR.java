package beecrowd;

import java.util.Scanner;

public class problema_usandoFOR {

	public static void main(String[] args) {
		int[] listaValores = {100, 50, 20, 10, 5, 2, 1};
		
		Scanner sc = new Scanner(System.in);
		int cedulas;
		int total = sc.nextInt();
		System.out.println(total);
				
		for (int i = 0; i < listaValores.length; i++) {
			cedulas = total / listaValores[i];
			System.out.printf("%d nota(s) de R$ %d,00%n", cedulas, listaValores[i]);
			total = total - cedulas * listaValores[i];
		}
		sc.close();

	}

}