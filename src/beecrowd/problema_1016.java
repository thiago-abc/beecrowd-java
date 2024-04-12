package beecrowd;

import java.util.Scanner;

public class problema_1016 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int velocidadeX = 60;
		int velocidadeY = 90;
		int distancia = sc.nextInt();
		int tempoEmHoras = distancia / (velocidadeY - velocidadeX);
		int tempoEmMinutos = tempoEmHoras * 60;
		
		System.out.printf("%d minutos", tempoEmMinutos);
		
		sc.close();
		

	}

}
