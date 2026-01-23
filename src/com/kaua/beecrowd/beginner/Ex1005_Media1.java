package com.kaua.beecrowd.beginner;

import java.util.Scanner;

public class Ex1005_Media1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();

        double pesoA = 3.5;
        double pesoB = 7.5;
        double somaPeso = 11;

        double media = ((A * pesoA) + (B * pesoB)) / somaPeso;

        System.out.printf("MEDIA = %.5f\n", media);

        sc.close();
    }
}
