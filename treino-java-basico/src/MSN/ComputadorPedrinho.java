package MSN;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        //abrindo msn messager
        System.out.println("MSN");
        MSNMessenger msn = new MSNMessenger();
        msn.envarMensagem();
        msn.receberMensagem();

        System.out.println("Facebook");
        FacebookMessenger fcb = new FacebookMessenger();
        fcb.envarMensagem();
        fcb.receberMensagem();

        System.out.println("Telegram");
        Telegram tlg = new Telegram();
        tlg.envarMensagem();
        tlg.receberMensagem();
    }
}
