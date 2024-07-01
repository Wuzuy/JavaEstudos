package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {

    public static void main(String[] args) {
        Aluno a1 = new Aluno("Tiago", 7.0);
        Aluno a2 = new Aluno("Fernando", 5.2);
        Aluno a3 = new Aluno("Pedro", 9.1);
        Aluno a4 = new Aluno("Farias", 7.6);
    
        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        Predicate<Aluno> aprovado = a -> a.nota >=7;

        System.out.println(alunos.stream().allMatch(aprovado));
        System.out.println(alunos.stream().anyMatch(aprovado));
        System.out.println(alunos.stream().noneMatch(aprovado));

    }

}