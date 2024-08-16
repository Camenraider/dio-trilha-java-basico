package pilares_do_poo.ex_interface.equipamentos.impressoras;

public class Deskjet implements Impressora{
    @Override
    public void imprimir() {
        System.out.println("Deskjet Imprimindo...");
    }
}
