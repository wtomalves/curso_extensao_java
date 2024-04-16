import java.util.ArrayList;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //array vetor --- Estrutura de dados
        // posição         0  1   2   3   4   5
        int[] megasena = { 9, 12, 25, 29, 31, 44};
        System.out.println(megasena[4]);

        megasena[5] = 46;
        System.out.println(megasena[5]);

        /*
        //Criando variável do tamanho 6
        int[] aposta = new int[6];
        System.out.println("Digite os valores da apostas...");
        for (int i=0; i < aposta.length; i++) {
            aposta[i] = scan.nextInt();
        }

        for (int i=0; i < aposta.length; i++) {
            System.out.println("O valor da aposta n° " +(i+1)+  " é " + aposta[i]);
        }

         */
        ArrayList<Integer> megasenalizando = new ArrayList<Integer>();

        System.out.println("Digite os valores da apostas...");
        for (int i=0; i < 6; i++) {
            megasenalizando.add(scan.nextInt());
        }

        //add adiona o dado no último elemento
        // com megasena.add podemos especificar aonde será o mudança:  megasena.add(0, 10) aqui estamo inserindo o
        //o valor 10 na posição zero
        // megasena.remove para remover o dado
        //E quando imprimimos, ele imprima a lista completa sem precisar espeficicar o indice
        System.out.println(megasenalizando);


    }
}