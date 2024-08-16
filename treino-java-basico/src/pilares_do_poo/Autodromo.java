package pilares_do_poo;

public class Autodromo {
    public static void main(String[] args) {
        System.out.println("instanciando classes especializadas");
        Carro jeep = new Carro();
        jeep.setChassi("76845332");
        jeep.ligar();

        Moto z400 = new Moto();
        z400.setChassi("321654");
        z400.ligar();

        System.out.println("Instanciando uma classe genêrica");

        Veiculo coringa = z400;
        coringa.ligar();
    }
}
