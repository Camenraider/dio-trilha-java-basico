public class ExemploFor {
    public static void main(String[] args) {
        for (int carneirinhos =1; carneirinhos <=20; carneirinhos++){
            if (carneirinhos == 3) {
                System.out.println("Pulando o terceiro");
                continue;
            }
            System.out.println("Contando carneirinhos " + carneirinhos);
        }

        System.out.println("Joãozinho dormiu");
    }
}
