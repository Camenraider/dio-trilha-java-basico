package pilares_do_poo.polimorfismo.MSN;

public class MSNMessenger extends ServicoMensagemInstantanea {
    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo MSN Messenger");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo MSN Messenger");
    }

    @Override
    protected void salvarHistoricoMensagem() {
        System.out.println("Salvando histórico do MSN Messenger");
    }
}
