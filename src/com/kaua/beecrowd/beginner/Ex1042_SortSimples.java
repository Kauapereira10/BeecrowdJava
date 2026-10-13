package com.kaua.beecrowd.beginner;

import java.util.List;
import java.util.Scanner;

public class Ex1042_SortSimples {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor1 = sc.nextInt();
        int valor2 = sc.nextInt();
        int valor3 = sc.nextInt();

        List<Integer> valoresOrdenados = List.of(valor1, valor2, valor3)
                .stream()
                .sorted()
                .toList();

        valoresOrdenados.forEach(System.out::println);

        System.out.println();

        System.out.println(valor1);
        System.out.println(valor2);
        System.out.println(valor3);

        sc.close();
    }

}
