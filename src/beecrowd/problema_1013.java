package beecrowd;

import java.util.Scanner;

public class problema_1013 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, maiorAb, maior;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		maiorAb = (a + b + Math.abs(a - b)) / 2;
		maior = (maiorAb + c + Math.abs(maiorAb - c)) / 2;
		
		if (maiorAb > maior) {
			System.out.printf("%d eh o maior%n", maiorAb);
		}
		else {
			System.out.printf("%d eh o maior%n", maior);
		}
		
		sc.close();

	}

}
