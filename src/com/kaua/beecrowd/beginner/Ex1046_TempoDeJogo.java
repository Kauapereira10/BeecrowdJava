package com.kaua.beecrowd.beginner;

import java.util.Scanner;

public class Ex1046_TempoDeJogo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inicio = sc.nextInt();
        int fim = sc.nextInt();

        int duracao = (fim - inicio + 24) % 24;

        if (duracao == 0) {
            duracao = 24;
        }

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

        sc.close();
    }

}
