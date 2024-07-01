
package excecao; 

public class Basico {
    
    public static void main(String[] args) {
        Aluno a1 = null; // Os erros serão obrigatórios

        try {
            imprimirNomeDoAluno(a1);
        }catch (Exception excecao) {
            System.out.println("Ocorreu um erro no momento de imprimir o nome do usuário!\n");
        }
        
        try {
            System.out.println(7/0);
        } catch (ArithmeticException e) {
            //Não deve ser chego aqui!
            // e.printStackTrace();
            System.out.println("Ocorreu o erro: " + e.getMessage() + "\n");
        }

        System.out.println("Fim! :)");
    }
    public static void imprimirNomeDoAluno(Aluno aluno) {
        System.out.println(aluno.name);
    }
}