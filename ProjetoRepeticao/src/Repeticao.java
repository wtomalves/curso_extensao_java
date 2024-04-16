import java.util.Scanner;

public class Repeticao {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Quantas vezes você quer que a frase 'Vou vencer' repita: ");
        int repeticao = scan.nextInt();
        int cont = 1;
        while (cont <= repeticao) {
            cont += 1;
            System.out.println("Vou vencer...!");
        }


        System.out.println("\nEntrando no FOR\n");

        for (int contando=1; 2 >= contando;contando++){
            System.out.println("Vou vencer...!");
        }

        System.out.print("Somar valores entre 1 e 50: ");
        int somar = 0;

        System.out.print("n° somados: ");
        for(int i=0; i <= 50; i++) {

            if (i % 2 == 0) {
                somar+=i;
                System.out.println(i);
            }

        }
        System.out.println("O resultado da soma é: " + somar);

    }
}