public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        byte idade = 123;
        short ano = 2024;
        int cep = 21012342; // se começar por zero usar String
        long cpf = 98765432109L; // se começar com zero usar String
        float pi = 3.14F;
        double salario = 5000.33;

        String meuNome = "João Paulo";

        double salarioMinimo = 2500.00;

        short numeroCurto =1;

        int numeroNormal = numeroCurto;
        // realizando um cast de int para short
        short numeroCurto2 = (short) numeroNormal;

        int numero = 5;
        numero = 10;

        System.out.println(numero);
    }
}
