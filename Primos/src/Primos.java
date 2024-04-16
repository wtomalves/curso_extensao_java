public class Primos {

    public static int numeroPrimo(int primo){

        int cont = 1;
        if (primo != 0 && primo != 1) {
            for (int i=0; i <= primo; i++) {
                if (primo % cont == 0) {
                    cont++;

                }
            }
        }
        return cont;
    }

    public static void main(String[] args) {

       int resp = numeroPrimo(97);
       if (resp == 2) {
           System.out.println("É número primo!");
       } else {
           System.out.println("Não é número primo!");
       }
    }
}