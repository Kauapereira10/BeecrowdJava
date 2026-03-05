package com.kaua.beecrowd.beginner;

import java.util.Locale;
import java.util.Scanner;

public class Ex1021_NotasEMoedas {
    public static void main(String[] args) {
    	Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double n = sc.nextDouble();

        int valor = (int) Math.round(n * 100);

        int[] notas = {10000, 5000, 2000, 1000, 500, 200};
        int[] moedas = {100, 50, 25, 10, 5, 1};

        System.out.println("NOTAS:");

        for (int nota : notas) {
            int qtd = valor / nota;
            System.out.printf("%d nota(s) de R$ %.2f\n", qtd, nota / 100.0);
            valor %= nota;
        }

        System.out.println("MOEDAS:");

        for (int moeda : moedas) {
            int qtd = valor / moeda;
            System.out.printf("%d moeda(s) de R$ %.2f\n", qtd, moeda / 100.0);
            valor %= moeda;
        }

        sc.close();
    }
}