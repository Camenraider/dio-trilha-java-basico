package argumentos;

public class AboutMe {
    public static void main(String[] args) {
        // os argumentos começam com indice 0
        String nome = args[0];
        String sobreNome = args[1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);

        System.out.println("Olá, me chamo " + nome + " " + sobreNome);
        System.out.println("Tenho " + idade +" anos ");
        System.out.println("Minha altura é " + altura + "cm ");
    }
}
