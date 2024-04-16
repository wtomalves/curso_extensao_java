import java.util.Scanner;

public class Quadrado {

    public static void quadrado(int lado){

        System.out.println("Área do quadrado é " + (lado * lado));
        System.out.println("Perimetro do quadrado é " + (4 * lado));
        System.out.printf("Diagonal do quadrado é %.2f", (Math.sqrt(2) * lado));

    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o valor do lado de um quadrado: ");
        int lado = teclado.nextInt();
        quadrado(lado);

    }
}