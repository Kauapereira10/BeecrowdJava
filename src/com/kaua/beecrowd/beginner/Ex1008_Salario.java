package com.kaua.beecrowd.beginner;

import java.util.Locale;
import java.util.Scanner;

public class Ex1008_Salario {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int numero = sc.nextInt();
		int horasTrabalhadas = sc.nextInt();
		
		double recebePorHora = sc.nextDouble();
		
		double salarioTotal = horasTrabalhadas * recebePorHora;

		System.out.printf("NUMBER = %d\n", numero);
		System.out.printf("SALARY = U$ %.2f\n", salarioTotal);

		sc.close();
	}
}
