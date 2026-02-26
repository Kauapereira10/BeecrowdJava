package com.kaua.beecrowd.beginner;

import java.util.Scanner;

public class Ex1018_Cedulas {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int valor = sc.nextInt();
		System.out.println(valor);
		
		int[] notas = {100, 50, 20, 10, 5, 2, 1};
		
		for (int nota : notas) {
			int quantidadeNotas = valor / nota;
			System.out.println(quantidadeNotas + " nota(s) de R$ " + nota + ",00");
			valor = valor % nota;
		}
		
		sc.close();
	}
}
