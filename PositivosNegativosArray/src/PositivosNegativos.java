import java.util.ArrayList;
import java.util.Arrays;

public class PositivosNegativos {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        int[] megasena = {10,20,30};
        ArrayList<Integer> lista = new ArrayList<Integer>(Arrays.asList(10,20,30));
        ArrayList<String> nomes = new ArrayList<String>(Arrays.asList("Cachorrinho", "Mozart", "Tempestade"));

        System.out.println(lista);
        System.out.println(nomes);

        ArrayList<Integer> listas = new ArrayList<Integer>(Arrays.asList(-10,20,30,-50,90,3,0));

        int positivos=0, negativos=0, zeros= 0;
        for (int num : listas){
            if (num > 0) {
                positivos++;
            } else if (num < 0) {
                negativos++;
            } else{
                zeros++;
            }
        }
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Zeros: " + zeros);

    }
}