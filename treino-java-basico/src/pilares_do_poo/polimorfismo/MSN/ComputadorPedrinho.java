package pilares_do_poo.polimorfismo.MSN;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        ServicoMensagemInstantanea smi = null;
        /*
            Não se sabe qua APP
            mas qualquer um deverá enviar e receber mensagem
         */

        String appEscolhido = "fbm";

        if (appEscolhido.equals("msn")){
            smi = new MSNMessenger();
        } else if (appEscolhido.equals("fbm")){
            smi = new FacebookMessenger();
        } else if (appEscolhido.equals("tlgh")){
            smi = new Telegram();
        }

        smi.enviarMensagem();
        smi.receberMensagem();

        // Se a essa classe for removida do mesmo pacote das outras classes perde a visibilidade.
       smi.validarConectadoInternet();
    }

}
