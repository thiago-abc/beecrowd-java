package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class problema_1011 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double raio = sc.nextDouble();
		double volume = (4.0/3.0) * 3.14159 * (raio * raio * raio);
		
		System.out.printf("VOLUME = %.3f%n", volume);
		
		sc.close();

	}

}
