package MSN;

public class ServicoMensagemInstantanea {
    // primeiro confirmar se esta conectado a internet
    public void envarMensagem(){
        validarConectadoInternet();
        System.out.println("Enviando Mensagem");
        salvarHistoricoMensagem();
    }
    public void receberMensagem(){
        System.out.println("Recebendo mensagem");
    }
    // Métodos privados, visíveis somente na classe.
    private void validarConectadoInternet(){
        System.out.println("Validando se está conectado a internet");
    }
    private void salvarHistoricoMensagem(){
        System.out.println("Salvando histórico da mensagem");
    }
}
