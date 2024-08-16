package pilares_do_poo.polimorfismo.MSN;

public class FacebookMessenger extends ServicoMensagemInstantanea {
    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Facebook Messenger");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Facebook Messenger");
    }

    @Override
    protected void salvarHistoricoMensagem() {
        System.out.println("Salvando histórico do Facebook Messenger");
    }
}
