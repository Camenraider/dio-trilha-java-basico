package pilares_do_poo.ex_interface.equipamentos.multfuncional;

import pilares_do_poo.ex_interface.equipamentos.copiadoras.Copiadora;
import pilares_do_poo.ex_interface.equipamentos.digitalizadoras.Digitalizadora;
import pilares_do_poo.ex_interface.equipamentos.impressoras.Impressora;

public class EquipamentoMultFuncional implements Copiadora, Digitalizadora, Impressora {
    @Override
    public void copiar() {
        System.out.println("Multifuncional Copiando...");
    }

    @Override
    public void digitalizar() {
        System.out.println("Multifuncional Digitaliznado...");
    }

    @Override
    public void imprimir() {
        System.out.println("Multifuncional Imprimindo...");
    }
}
