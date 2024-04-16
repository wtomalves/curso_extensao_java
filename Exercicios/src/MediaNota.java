import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class MediaNota {

    public static void main(String[] args) {
        //Leitura do teclado usando a classe Scanner
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a 1 nota: ");
        double nota_1 = teclado.nextDouble();
        System.out.print("Digite a 2 nota: ");
        double nota_2 = teclado.nextDouble();
        System.out.print("Digite a 3 nota: ");
        double nota_3 = teclado.nextDouble();
        double resultado = (nota_1 + nota_2 + nota_3) / 3;
        System.out.println(String.format("A média das 3 notas é %.1f ", resultado));
    }
}