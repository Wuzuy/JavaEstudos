package excecao;

public class Aluno {
    
    final public String name;
    public final double nota;
    final public boolean bomComportamento;

    public Aluno(String nome, double nota) {
        this(nome, nota, true);
    }

    public Aluno(String name, double nota, boolean bomComportamento) {
        
        this.name = name;
        this.nota = nota;
        this.bomComportamento = bomComportamento;
    }
    @Override
    public String toString() {
        return name + "tem nota " + nota;        
    }   
}