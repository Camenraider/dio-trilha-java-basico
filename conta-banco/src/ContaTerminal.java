import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        final String saudacao = "Olá ";

        Conta conta = new Conta();

        
        Locale.setDefault(new Locale("pt", "Br"));
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número ");
        conta.setNumero(Integer.valueOf(scan.nextInt()));
        scan.nextLine();

        System.out.println("Digite a agência ");
        conta.setAgencia(String.valueOf(scan.next()));
        scan.nextLine();

        System.out.println("Digite o nome do cliente ");
        conta.setNomeCliente(String.valueOf(scan.nextLine()));
    
        scan.reset();

        // Para OS em Português usar , se não usar . para as casas decimais.
        System.out.println("Digite o saldo da conta");
        conta.atualizaSaldo(Double.valueOf(scan.nextDouble()));
        scan.nextLine();

        scan.close();


        System.out.println(saudacao + conta.getNomeCliente() + "!" + "\n"
                + "Obrigado por criar conta em nosso banco, sua agência é "
                + conta.getAgencia() + "\n" + "Conta: " + conta.getNumero() + " e seu saldo é " + conta.getSaldo()
                + " já está disponível");

        System.out.println("fim");
    }
}
