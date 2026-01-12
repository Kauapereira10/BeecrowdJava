package com.kaua.beecrowd.beginner;

import java.util.Locale;
import java.util.Scanner;

public class Ex1002_AreaCirculo {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		double  pi = 3.14159;
		double raio = Math.pow(r, 2);
		double area = pi * raio;
		
		System.out.printf("A=%.4f\n", area);
		
		sc.close();
	}
}
