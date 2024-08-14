package estruturas_exepcionais;

public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatCep("2376506");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O cep não corresponde as regras de negócio.");
        }
    }
    // formata de uma forma ilustativa.
    static String formatCep(String cep) throws CepInvalidoException{
        if (cep.length() != 8) {
            throw new CepInvalidoException();
        }
            return "23.765-064";
        
    }
}
