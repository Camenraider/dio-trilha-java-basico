package pilares_do_poo.ex_interface.equipamentos.impressoras;

public class Laserjet implements Impressora{
    @Override
    public void imprimir() {
        System.out.println("Laserjet Imprimindo...");
    }
}
