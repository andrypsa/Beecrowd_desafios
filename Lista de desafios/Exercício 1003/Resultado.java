import java.util.Scanner;

public class Resultado {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int A, B;
        int SOMA;

        A = teclado.nextInt();
        B = teclado.nextInt();
        SOMA = (A + B);

        System.out.println("SOMA = " + SOMA);
        teclado.close();
    }

}
