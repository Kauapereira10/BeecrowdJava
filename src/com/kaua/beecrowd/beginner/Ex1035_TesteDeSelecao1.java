package com.kaua.beecrowd.beginner;

import java.util.Scanner;

public class Ex1035_TesteDeSelecao1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();

		boolean condicao1 = b > c;
		boolean condicao2 = d > a;
		boolean condicao3 = (c + d) > (a + b);
		boolean condicao4 = c > 0 && d > 0;
		boolean condicao5 = a % 2 == 0;

		if (condicao1 && condicao2 && condicao3 && condicao4 && condicao5) {
			System.out.println("Valores aceitos");
		} else {
			System.out.println("Valores nao aceitos");
		}

		sc.close();
	}
}