import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void substitui(ArrayList<Integer> lista) {

        for (int i=0; i < lista.size(); i++) {
            if (lista.get(i) == 0) {
                lista.set(i, 1);
            }
        }

    }


    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>(Arrays.asList(20,0,0,0,4,0,50));
        substitui(lista);
        System.out.println(lista);
    }
}