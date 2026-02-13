package com.kaua.beecrowd.beginner;

import java.util.Locale;
import java.util.Scanner;

public class Ex1009_SalarioComBonus {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome = sc.nextLine();
		double salarioFixo = sc.nextDouble();
		double totalVendas = sc.nextDouble();
		
		double bonus = totalVendas * 0.15;
		double salarioComBonus = salarioFixo + bonus;
		
		System.out.printf("TOTAL = R$ %.2f\n", salarioComBonus);
		
		
		sc.close();
	}
}
