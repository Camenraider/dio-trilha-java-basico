public class OperadoresRelacionais {
    public static void main(String[] args) {
        String nome1 = "João";
        String nome2 = "João";
        String nome3 = new String("João");

        System.out.println("Comparando texto: " + (nome1 == nome2));
        // Comparando objetos
        System.out.println("Comparando objetos: " + (nome2 == nome3));

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if (numero1<numero2) {
            System.out.println("a nossa condição é verdadeira");
        }

        System.out.println("numero um é igual a numeroDois? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("numero um é diferente de numeroDois? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("numero um é maior que numeroDois? " + simNao);

        simNao = numero1 < numero2;

        System.out.println("numero um é menor que numeroDois? " + simNao);
    }
}
