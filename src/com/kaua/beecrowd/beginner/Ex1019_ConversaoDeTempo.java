package com.kaua.beecrowd.beginner;

import java.util.Scanner;

public class Ex1019_ConversaoDeTempo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int horas = n / 3600;
		int minutos = (n % 3600) / 60; 
		int segundos = (n % 3600) % 60;
		
		System.out.println(horas + ":" + minutos + ":" + segundos);
		
		sc.close();
	}
}	
