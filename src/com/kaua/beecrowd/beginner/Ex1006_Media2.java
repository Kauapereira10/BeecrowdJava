package com.kaua.beecrowd.beginner;

import java.util.Locale;
import java.util.Scanner;

public class Ex1006_Media2 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		
		int somaPeso = 10;
		
		double media = ((2 * A) + (3 * B) + (5 * C)) / somaPeso;

		System.out.printf("MEDIA = %.1f\n", media);
        sc.close();
	}
}
