import java.util.Scanner;

public class Resultado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double A, B, C;
        double MEDIA;

        A = teclado.nextDouble();
        B = teclado.nextDouble();
        C = teclado.nextDouble();

        // X = 2 + 3 + 5 = 10//
        MEDIA = ((A * 2) + (B * 3) + (C * 5)) / 10;

        System.out.println("MEDIA = " + String.format("%.1f", MEDIA));

        teclado.close();
    }

}
