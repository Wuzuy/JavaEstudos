package colecoes;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        ArrayList<Usuario> lista = new ArrayList<>();

        Usuario u1 = new Usuario("Lucas");
        lista.add(u1);
        lista.add(new Usuario("Tiago"));
        lista.add(new Usuario("Ana"));
        lista.add(new Usuario("Tiago Farias de Canto Martins"));

        System.out.println(lista.get(3).name);

        System.out.println("Removendo " + lista.remove(3).name);
        System.out.println(lista.remove(new Usuario("Ana")));

        System.out.println("Tem um tiago? " + lista.contains(new Usuario("Tiago")));

        for (Usuario pessoas: lista) {
            System.out.println(pessoas);
        }
    }
}
