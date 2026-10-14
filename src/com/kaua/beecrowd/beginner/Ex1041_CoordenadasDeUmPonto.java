package com.kaua.beecrowd.beginner;

import java.util.Locale;
import java.util.Scanner;

public class Ex1041_CoordenadasDeUmPonto {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double valorX = sc.nextDouble();
        double valorY = sc.nextDouble();

        if (valorX == 0 && valorY == 0) {
            System.out.println("Origem");
        } else if(valorX == 0){
            System.out.println("Eixo Y");
        }else if(valorY == 0){
            System.out.println("Eixo X");
        }  else if (valorX > 0  && valorY > 0) {
            System.out.println("Q1");
        } else if (valorX < 0 && valorY > 0) {
            System.out.println("Q2");
        } else if (valorX < 0 && valorY < 0) {
            System.out.println("Q3");
        }  else {
            System.out.println("Q4");
        }

        sc.close();
    }

}
