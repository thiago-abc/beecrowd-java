package beecrowd;

import java.util.Scanner;

public class problema_1070 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int count = 0;
		
		while (count < 6) {
			int calcula = X % 2;
			if (calcula != 0) {
				System.out.println(X);
				count += 1;
			}
			X += 1;
		}
		
		sc.close();

	}

}
