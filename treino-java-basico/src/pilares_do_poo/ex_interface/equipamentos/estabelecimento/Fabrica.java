package pilares_do_poo.ex_interface.equipamentos.estabelecimento;

import pilares_do_poo.ex_interface.equipamentos.copiadoras.Copiadora;
import pilares_do_poo.ex_interface.equipamentos.digitalizadoras.Digitalizadora;
import pilares_do_poo.ex_interface.equipamentos.digitalizadoras.Scanner;
import pilares_do_poo.ex_interface.equipamentos.impressoras.Deskjet;
import pilares_do_poo.ex_interface.equipamentos.impressoras.Impressora;
import pilares_do_poo.ex_interface.equipamentos.impressoras.Laserjet;
import pilares_do_poo.ex_interface.equipamentos.multfuncional.EquipamentoMultFuncional;

public class Fabrica {
    public static void main(String[] args) {
        Impressora impressora = new Deskjet();
        impressora.imprimir();

        Impressora impressoraLaser = new Laserjet();
        impressoraLaser.imprimir();

        System.out.println("---------------------------------------------");
        EquipamentoMultFuncional em = new EquipamentoMultFuncional();
        Impressora impressora1 = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;

        impressora1.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();

        // usar a classe correta do pacote digitalizadoras para importar a classe scanner
        Scanner scanner = new Scanner();
        scanner.digitalizar();

        // a Impressora não é um Scanner e a Copiadora também não, mas a Digitalizadora é sim um Scanner do nosso pacote.
//        Impressora impressora2 = scanner;
        Digitalizadora digitalizadora1 = scanner;
//        Copiadora copiadora1 = scanner;


    }
}
