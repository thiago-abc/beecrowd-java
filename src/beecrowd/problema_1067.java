package beecrowd;

import java.util.Scanner;

public class problema_1067 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
				
		for (int i = 1; i <= X; i++) {
			int calcula = i % 2;
			if (calcula != 0) {
				System.out.println(i);
			}
			
		}
		
		sc.close();
		
	}

}
