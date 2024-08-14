public class ExemploBreakContinue {
    public static void main(String[] args) {
        for(int numero = 1; numero <= 5; numero++){
            if (numero == 3) {
                System.out.println("For break.");
                break;
            }
            System.out.println(numero);
        }

        System.out.println("fim for 1");
        System.out.println("");

        for(int numero = 1; numero <= 5; numero++){
            if (numero == 3) {
                System.out.println("For continue.");
                continue;
            }
            System.out.println(numero);
        }

        System.out.println("fim for 2");
    }
}
