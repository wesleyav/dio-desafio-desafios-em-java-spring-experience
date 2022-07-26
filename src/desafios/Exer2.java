package desafios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer2 {

	public static void main(String[] args) {

//	2 / 4 - Médias Ponderadas

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o número de casos");
		int casos = sc.nextInt();
		int cont = 0;

		while (cont < casos) {

			System.out.println("Informe o primeiro valor");
			double a = sc.nextDouble();
			System.out.println("Informe o segundo valor");
			double b = sc.nextDouble();
			System.out.println("Informe o terceiro valor");
			double c = sc.nextDouble();

			double mp = ((a * 2) + (b * 3) + (c * 5)) / 10;
			DecimalFormat df = new DecimalFormat("0.0");
			System.out.println("A média ponderada é: " + df.format(mp));

			cont++;
		}
		sc.close();
		System.out.println("fim");

	}

}
