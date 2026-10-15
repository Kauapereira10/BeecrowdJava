import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double valorTemp;
      
        if (A < B) {
            valorTemp = A;
            A = B;
            B = valorTemp;
        }
        if (A < C) {
            valorTemp = A;
            A = C;
            C = valorTemp;
        }
        if (B < C) {
            valorTemp = B;
            B = C;
            C = valorTemp;
        }

        double A2 = A * A;
        double B2 = B * B;
        double C2 = C * C;

        // 3. Validação da existência e classificações
        if (A >= B + C) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if (Math.abs(A2 - (B2 + C2)) < 1e-9) {
                System.out.println("TRIANGULO RETANGULO");
            } else if (A2 > B2 + C2) {
                System.out.println("TRIANGULO OBTUSANGULO");
            } else if (A2 < B2 + C2) {
                System.out.println("TRIANGULO ACUTANGULO");
            }

            if (A == B && B == C) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if (A == B || B == C) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }

        sc.close();
    }
}
