package com.kaua.beecrowd.beginner;

import java.util.Locale;
import java.util.Scanner;

public class Ex1010_CalculoSimples {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int codigoPeca1 = scanner.nextInt();
        int quantidadePeca1 = scanner.nextInt();
        double valorUnitarioPeca1 = scanner.nextDouble();

        int codigoPeca2 = scanner.nextInt();
        int quantidadePeca2 = scanner.nextInt();
        double valorUnitarioPeca2 = scanner.nextDouble();

        double totalPeca1 = quantidadePeca1 * valorUnitarioPeca1;
        double totalPeca2 = quantidadePeca2 * valorUnitarioPeca2;
        double valorTotal = totalPeca1 + totalPeca2;

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorTotal);

        scanner.close();
    }
}
