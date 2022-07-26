package desafios;

import java.util.Scanner;

public class Exer1 {

	public static void main(String[] args) {

//		1 / 4 - Entrada e Saída Lendo e Pulando Nomes

		Scanner sc = new Scanner(System.in);

		String[] nomes = new String[10];

		for (int i = 0; i < nomes.length; i++) {
			nomes[i] = sc.nextLine().replaceAll("\\s+", "");

		}
		sc.close();

		System.out.println(nomes[2]);
		System.out.println(nomes[6]);
		System.out.println(nomes[8]);

	}

}
