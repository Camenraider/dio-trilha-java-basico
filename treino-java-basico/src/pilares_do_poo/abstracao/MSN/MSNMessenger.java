package pilares_do_poo.abstracao.MSN;

public class MSNMessenger extends ServicoMensagemInstantanea {


    @Override
    public void enviarMensagem() {
        System.out.println("Enviando mensagem pelo MSN Messenger");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo MSN Messenger");
    }
}
