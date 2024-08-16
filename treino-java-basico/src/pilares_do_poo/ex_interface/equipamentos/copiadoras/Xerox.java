package pilares_do_poo.ex_interface.equipamentos.copiadoras;

public class Xerox implements Copiadora{
    @Override
    public void copiar() {
        System.out.println("Xerox copiando...");
    }
}
