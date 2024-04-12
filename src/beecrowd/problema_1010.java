package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class problema_1010 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codPecaUm = sc.nextInt();
		int numeroDePecasUm = sc.nextInt();
		double valorPecaUm = sc.nextDouble();
		int codPecaDois = sc.nextInt();
		int numeroDePecasDois = sc.nextInt();
		double valorPecaDois = sc.nextDouble();
		
		double total = (numeroDePecasUm * valorPecaUm) + (numeroDePecasDois * valorPecaDois);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		
		sc.close();

	}

}
