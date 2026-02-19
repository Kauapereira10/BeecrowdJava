package com.kaua.beecrowd.beginner;

import java.util.Locale;
import java.util.Scanner;

public class Ex1015_DistanciaEntreDoisPontos {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double x1 = sc.nextDouble();
		double x2 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double y2 = sc.nextDouble();
		
		double p1 = Math.pow(x1 - y1, 2);  
		double p2 = Math.pow(x2 - y2, 2); 
		
		double distancia =  Math.sqrt(p1 + p2);
		
		System.out.printf("%.4f\n", distancia);
		
		sc.close();
	}
}
