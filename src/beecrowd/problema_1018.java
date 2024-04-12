package beecrowd;

import java.util.Scanner;

public class problema_1018 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		System.out.printf("%d%n", total);
				
		int cedulaCem = total / 100;
		total = total - cedulaCem * 100;
		
		int cedulaCinquenta = total / 50;
		total = total - cedulaCinquenta * 50;
		
		int cedulaVinte = total / 20;
		total = total - cedulaVinte * 20;
		
		int cedulaDez = total / 10;
		total = total - cedulaDez * 10;
		
		int cedulaCinco = total / 5;
		total = total - cedulaCinco * 5;
				
		int cedulaDois = total / 2;
		total = total - cedulaDois * 2;
				
		int cedulaUm = total / 1;
		total = total - cedulaUm * 1;
		System.out.printf("%d nota(s) de R$ 100,00%n", cedulaCem);
		System.out.printf("%d nota(s) de R$ 50,00%n", cedulaCinquenta);
		System.out.printf("%d nota(s) de R$ 20,00%n", cedulaVinte);
		System.out.printf("%d nota(s) de R$ 10,00%n", cedulaDez);
		System.out.printf("%d nota(s) de R$ 5,00%n", cedulaCinco);
		System.out.printf("%d nota(s) de R$ 2,00%n", cedulaDois);
		System.out.printf("%d nota(s) de R$ 1,00%n", cedulaUm);
				
		sc.close();		

	}

}
