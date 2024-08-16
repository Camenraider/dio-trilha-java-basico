package pilares_do_poo.ex_interface.equipamentos.digitalizadoras;

public class Scanner implements Digitalizadora{
    @Override
    public void digitalizar() {
        System.out.println("Scanner digitalizando...");
    }
}
