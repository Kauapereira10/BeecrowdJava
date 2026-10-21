package com.kaua.beecrowd.beginner;

import java.util.Scanner;

public class Ex1047_TempoDeJogoComMinutos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horaInicial = sc.nextInt();
        int minutosInicial = sc.nextInt();
        int horaFinal = sc.nextInt();
        int minutosFinal = sc.nextInt();

        int inicio = horaInicial * 60 + minutosInicial;
        int fim = horaFinal * 60 + minutosFinal;
        int duracao = fim - inicio;

        if (duracao <= 0) {
            duracao = duracao + 1440;
        }

        int horas = duracao / 60;
        int minutos = duracao % 60;

        System.out.println("O JOGO DUROU " + horas + " HORA(S) E " + minutos + " MINUTO(S)");

        sc.close();
    }

}
