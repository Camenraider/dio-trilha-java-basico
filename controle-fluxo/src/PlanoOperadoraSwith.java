public class PlanoOperadoraSwith {
    public static void main(String[] args) {
        String plano = "T";

        switch (plano) {
            case "T":
                System.out.println("5Gb Youtube");
                break;
                case "M":
                System.out.println("whtas e Instagram grátis");
                break;
                case "B":
                System.out.println("100 minutos de ligação");
                break;
            default:
                System.out.println("Digite um plano definido T, M, B");
                break;
        }
    }
}
