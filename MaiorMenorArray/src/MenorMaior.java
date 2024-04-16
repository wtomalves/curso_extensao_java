import java.util.ArrayList;
import java.util.Arrays;

public class MenorMaior {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>(Arrays.asList(20,30,40,90,10,60));
        int maior = lista.get(0);
        int menor = lista.get(0);
        for (int num : lista) {
            if (maior < num) {
                maior = num;
            }

            if (menor > num) {
                menor = num;
            }
        }
        System.out.println("O maior n° é " + maior);
        System.out.println("O menor n° é " + menor);


    }
}