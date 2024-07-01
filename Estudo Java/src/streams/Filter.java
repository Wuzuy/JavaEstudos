package streams;

import java.util.Arrays;
import java.util.List;

public class Filter {

    public static void main(String[] args) {
        
        Aluno a1 = new Aluno ("Ana", 5.6);
        Aluno a2 = new Aluno ("Tiago", 9.2);
        Aluno a3 = new Aluno ("Fernando", 6.2);
        Aluno a4 = new Aluno ("Pablo", 4.2);
        Aluno a5 = new Aluno ("Lucas", 7.5);
        Aluno a6 = new Aluno ("Marcos", 2.1);
        Aluno a7 = new Aluno ("Nicolas", 6.3);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7);

        alunos.stream()
        .filter(a -> a.nota >= 7)
        .map(a -> "Parabéns " + a.name + ". Você foi aprovado!")
        .forEach(System.out::println);
    }
    
}