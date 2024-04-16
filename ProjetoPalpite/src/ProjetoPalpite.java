import java.util.Random;
import java.util.Scanner;

public class ProjetoPalpite {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Tente acerta o número entre [1 e 10] que a IA pensou! ");
        System.out.print("Digite o palpite: ");
        int palpite = scan.nextInt();

        Random sorteio = new Random();
        int inteligenciaArtificial = sorteio.nextInt(1,11);
        System.out.println("IA pensou..." + inteligenciaArtificial);


        while (palpite != inteligenciaArtificial) {
            if (palpite < inteligenciaArtificial) {
                System.out.println("Um pouco mais...!");
            } else if (palpite > inteligenciaArtificial) {
                System.out.println("Um pouco menos...!");
            }
            System.out.print("Digite o palpite: ");
            palpite = scan.nextInt();
        }
        System.out.println("Parabens, esse foi o número escolhido pela IA.");


    }
}