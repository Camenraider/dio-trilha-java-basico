package pilares_do_poo.polimorfismo.MSN;

public class Telegram extends ServicoMensagemInstantanea {
    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Telegram Messenger");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Telegram Messenger");
    }

    @Override
    protected void salvarHistoricoMensagem() {
        System.out.println("Salvando histórico do Telegram Messenger");
    }
}
