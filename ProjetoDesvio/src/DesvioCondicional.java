import java.util.Scanner;

public class DesvioCondicional {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int idade = scan.nextInt();

        //Comando de desvio é quando usamos de alguma condição, representado pelo "if".
        //Ou seja, se verdadeiro execute o if, senão se falso, execute o else
        if (idade >= 18) {
            System.out.println("Você é maior de idade!");
        } else {
            System.out.println("Você é menor de idade!");
        }

        /*
        Condições lógicas:
         "E" lógico && (ambas condições devem ser verdadeiras)
         "OU" lógico || (Apenas uma condição precisa ser verdadeira)
         "NÂO" lógico !(Se a condição é verdadeira, torna falsa, e vice-versa)
        */
        System.out.println("\n");
        System.out.println("""
                          Condições lógicas:
                          
                           "E" lógico && (ambas condições devem ser verdadeiras)
                           "OU" lógico || (Apenas uma condição precisa ser verdadeira)
                           "NÂO" lógico !(Se a condição é verdadeira, torna falsa, e vice-versa)
                                     
                           """);
        if (idade >=18 && idade <=100){
            System.out.println("Sua idade está entre 18 a 100 anos ");
        }

        if (!(idade >= 18)) {
            System.out.println("Ativando o 'Não' lógico!");
        }

        int x = 29;
        if (idade > x) {
            System.out.println("A idade: " + idade + " é maior que X: " + x);
        } else if (idade < x){
            System.out.println("A idade: " + idade + " é menor que X: " + x);
        } else {
            System.out.println("Os números são iguais!");
        }


    }
}