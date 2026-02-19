package com.kaua.beecrowd.beginner;

import java.util.Locale;
import java.util.Scanner;

public class Ex1014_Consumo {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int distancia = sc.nextInt();
		double litros = sc.nextDouble();
		
		double consumo = distancia/litros;
		
		System.out.printf("%.3f km/l\n", consumo);
		
		sc.close();
	}
}
