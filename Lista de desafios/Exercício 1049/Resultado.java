import java.io.IOException;
import java.util.Scanner;

public class Resultado {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);

        String classificacao1 = teclado.nextLine();
        String classificacao2 = teclado.nextLine();
        String classificacao3 = teclado.nextLine();

        if (classificacao1.equals("vertebrado")) {
            if (classificacao2.equals("ave")) {
                if (classificacao3.equals("carnivoro")) {
                    System.out.println("aguia");
                } else {
                    System.out.println("pomba");
                }
            } else { // mamifero
                if (classificacao3.equals("onivoro")) {
                    System.out.println("homem");
                } else {
                    System.out.println("vaca");
                }
            }
        } else { // invertebrado
            if (classificacao2.equals("inseto")) {
                if (classificacao3.equals("hematofago")) {
                    System.out.println("pulga");
                } else {
                    System.out.println("lagarta");
                }
            } else { // anelideo
                if (classificacao3.equals("hematofago")) {
                    System.out.println("sanguessuga");
                } else {
                    System.out.println("minhoca");
                }
            }
        }

        teclado.close();
    }
}
