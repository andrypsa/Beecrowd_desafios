import java.util.Scanner;

public class Resultado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double A, B;
        double MEDIA;

        A = teclado.nextDouble();
        B = teclado.nextDouble();
        MEDIA = ((A * 3.5) + (B * 7.5)) / 11;

        System.out.println("MEDIA = " + String.format("%.5f", MEDIA));

        teclado.close();
    }

}
