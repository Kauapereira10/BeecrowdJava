package com.kaua.beecrowd.beginner;

import java.util.Locale;
import java.util.Scanner;

public class Ex1043_Triangulo {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double valorA = sc.nextDouble();
        double valorB = sc.nextDouble();
        double valorC = sc.nextDouble();

        double perimetro = valorA + valorB + valorC;
        double trapezio = (valorA + valorB) * valorC/2;

        if (valorA < valorB + valorC && valorB < valorA + valorC && valorC < valorA + valorB) {
            System.out.printf("Perimetro = %.1f%n", perimetro);
        } else {
            System.out.printf("Area = %.1f%n", trapezio);
        }

        sc.close();
    }

}
