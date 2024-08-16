package pilares_do_poo;

public class Carro {
    public void ligar(){
        conferindoCambio();
        conferindoCombustivel();
        System.out.println("Carro ligado");
    }
    private void conferindoCombustivel(){
        System.out.println("Conferindo combustivel");
    }
    private void conferindoCambio(){
        System.out.println("Conferindo cambio em P");
    }
}
