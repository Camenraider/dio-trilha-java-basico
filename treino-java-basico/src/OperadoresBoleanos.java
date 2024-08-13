public class OperadoresBoleanos {
    public static void main(String[] args) {
        boolean variavel = true;

        // Forma correta de inverção da variavel boleana
        variavel = !variavel;

        //System.out.println(!variavel);
        System.out.println(variavel);

        int a = 5;
        int b = 6;

        String resultado = "";

        if (a==b) {
            resultado = "verdadeiro";
        } else {
            resultado = "falso";
        }

        System.out.println("O resultado foi = " + resultado);

    }
}
