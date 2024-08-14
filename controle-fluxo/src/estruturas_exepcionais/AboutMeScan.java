package estruturas_exepcionais;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMeScan {
    public static void main(String[] args) {
        // Criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        try{
            System.out.println("Digite seu nome ");
            String nome = scanner.next();
    
            System.out.println("Digite seu sobrenome ");
            String sobreNome = scanner.next();
    
            System.out.println("Digite sua idade ");
            int idade = scanner.nextInt();
    
            System.out.println("Digite sua altura ");
            double altura = scanner.nextDouble();
    
            scanner.close();
    
            System.out.println("Ola, me chamo " + nome + " " + sobreNome);
            System.out.println("Tenho " + idade + " anos ");
            System.out.println("Minha altura é " + altura + " cm ");
        }
        catch(InputMismatchException e){
            System.out.println("Os campos idade e altura precisam ser numéricos" +
             " e a altura padrão us com . para casas decimais.");
        }
    }
}
