package MSN;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        //abrindo msn messager
        MSNMessenger msn = new MSNMessenger();
        msn.envarMensagem();
        msn.receberMensagem();
    }
}
