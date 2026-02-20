package com.kaua.beecrowd.beginner;

import java.util.Locale;
import java.util.Scanner;

public class Ex1017_GastoDeCombustivel {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int tempo = sc.nextInt();
		int velocidadeMedia = sc.nextInt();
		
		double litros = (tempo * velocidadeMedia) / 12.0;
		
		System.out.printf("%.3f\n", litros);
		
		sc.close();
	}
}
