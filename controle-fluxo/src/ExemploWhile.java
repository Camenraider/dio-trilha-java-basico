import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;

        while (mesada > 0) {
            Double valorDoce = valorAleatorio();
            if (valorDoce > mesada) {
                break;
            }

            System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho");
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada: " + mesada);
        System.out.println("Joãozinho gastou toda a mesada em doces.");
    }

    public static double valorAleatorio(){
        // faz um random entre os valores 2 inicial até 15 final limite
        return ThreadLocalRandom.current().nextDouble(2,15);
    }
}
