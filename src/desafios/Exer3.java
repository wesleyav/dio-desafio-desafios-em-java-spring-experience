package desafios;

import java.util.Scanner;

public class Exer3 {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int N, I;

		N = sc.nextInt();
		I = sc.nextInt();

		int count = 0;

		while (N > 0) {

			int id1, num;

			id1 = sc.nextInt();
			num = sc.nextInt();

			if (I == id1 && num == 0) {
				count++;
			}

			N--;
		}
		System.out.println(count);
		sc.close();

	}

}
