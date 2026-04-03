package com.kaua.beecrowd.beginner;

import java.util.Locale;
import java.util.Scanner;

public class Ex1036_FormulaDeBhaskara {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		double delta = Math.pow(b, 2) - (4 * a * c);
		double R1 = (-b + Math.sqrt(delta))/ (2 * a);
		double R2 = (-b - Math.sqrt(delta))/ (2 * a);
		
		if(delta > 0 && a != 0) {
			System.out.println("R1 = " + String.format("%.5f", R1));
			System.out.println("R2 = " + String.format("%.5f", R2));
		} else {
			System.out.println("Impossivel calcular");
		}
		
		sc.close();
	}
	
}
