package com.kaua.beecrowd.beginner;

import java.util.Scanner;

public class Ex1003_SomaSimples {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int SOMA = A + B;
		
		System.out.printf("SOMA = %d\n", SOMA);
		
		sc.close();
	}
}
