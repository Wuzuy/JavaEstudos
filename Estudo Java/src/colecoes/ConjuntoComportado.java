package colecoes;

import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

    public static void main(String[] args) {
        SortedSet<String> lista = new TreeSet<>();
        lista.add("Amigo");
        lista.add("Cleber");
        lista.add("Aufredo");

        for(String candidato: lista){
            System.out.println(candidato);
        }
    }
}