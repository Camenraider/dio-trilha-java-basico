public class OperadoresTernarios {
    public static void main(String[] args) {
        int a,b;
        a = 5;
        b = 6;

        // ternário boleano
        String resultado = a == b ? "verdadeiro" : "falso";
        // ternário numérico
        int resultadoNumerico = a == b ? 1 : 0;
        
        System.out.println(resultado);
        System.out.println(resultadoNumerico);
    }
}
