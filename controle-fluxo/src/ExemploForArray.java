public class ExemploForArray {
    public static void main(String[] args) {
        String alunos [] = {"João", "Paulo", "Felipe", "Jonas", "Julia", "Marcos"};

        // em arrays o indice inicia em zero
        for(int x =0; x < alunos.length; x++){
            System.out.println("O aluno no índice: " + x +" = " + alunos[x]);
        }

        for(String aluno : alunos){
            System.out.println("Nome do aluno é: " + aluno);
        }
    }
}
