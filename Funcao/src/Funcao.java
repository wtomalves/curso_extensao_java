import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Funcao {

    public static void destaque() {
        System.out.println("Eu sou o Método void e nao tenho a obrigatoriedade de retornar alguma coisa!");
    }

    public static void destacandoTexto(String texto) {
        System.out.println(texto);
    }

    public static int somar(int valor1, int valor2, int valor3) {
        int totalSoma = valor1 + valor2 + valor3;
        return totalSoma;

    }

    public static int maiorNumero(int valor1, int valor2, int valor3){
        /*
        int maior = 0;
        int cont = 0;
        while (cont <= 3) {
            cont++;
            if (maior == 0) {
                maior = valor1;
            } else if (maior < valor2) {
                maior = valor2;
            } else if (maior < valor3){
                maior = valor3;
            }
        }
         return maior;
        */
       int resp;
       if (valor1 >= valor2 && valor1 >= valor3) {
           resp = valor1;
       } else if (valor2 >= valor1 && valor2 >= valor3) {
           resp = valor2;
       } else {
           resp = valor3;
       }
       return resp;


    }

    public static void main(String[] args) {
        //Chamando a função
        destaque();
        destacandoTexto("Eu sou o mais belo entre todos!");
        int resultado = somar(10,20,30);
        System.out.println("Resultado da soma: " + resultado);
        int maior = maiorNumero(2,6,9);
        System.out.println("Entre os números digitados, o maior número é: " + maior);

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite 9 números e obtenha o maior valor digitado: ");

        int resp1 = maiorNumero(scan.nextInt(),scan.nextInt(),scan.nextInt());
        int resp2 = maiorNumero(scan.nextInt(),scan.nextInt(),scan.nextInt());
        int resp3 = maiorNumero(scan.nextInt(),scan.nextInt(),scan.nextInt());
        int resp = maiorNumero(resp1, resp2, resp3);
        System.out.println("O maior número digitado foi " + resp);
    }
}