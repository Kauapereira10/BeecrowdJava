package com.kaua.beecrowd.beginner;

import java.util.Scanner;

public class Ex1020_IdadeEmDias {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int idadeEmDias = sc.nextInt();
		int anos = idadeEmDias / 365;
		int meses = (idadeEmDias % 365) / 30;
		int dias = (idadeEmDias % 365) % 30;
		
		System.out.println(anos + " ano(s)");
		System.out.println(meses + " mes(es)");
		System.out.println(dias + " dia(s)");
		
		sc.close();
	}
}
