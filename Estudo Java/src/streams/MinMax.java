package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {

    public static void main(String[] args) {
        Aluno a1 = new Aluno("Tiago", 7.0);
        Aluno a2 = new Aluno("Fernando", 5.2);
        Aluno a3 = new Aluno("Pedro", 9.1);
        Aluno a4 = new Aluno("Farias", 7.6);
    
        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        Comparator<Aluno> melhorNota = (al1, al2) -> {
            if(al1.nota > al2.nota) return 1;
            if(al1.nota < al2.nota) return -1;
            return 0;
        };
        System.out.println(alunos.stream().max(melhorNota).get());
        System.out.println(alunos.stream().min(melhorNota).get());
    }
}