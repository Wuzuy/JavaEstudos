package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        
        Queue<String> fila = new LinkedList<>();

        // Offer -> Adicina o elemento a fila, caso esteja cheia retorna false.
        // Add -> Adiciona o elemento a fila, caso esteja cheia retorna erro.

        fila.add("Ana");
        fila.offer("Bia");
        fila.add("Carlos");
        fila.offer("Daniel");
        fila.add("Rafaela");
        fila.offer("Guilherme");
        
        System.out.println(fila.peek());
        System.out.println(fila.peek());
        System.out.println(fila.element());
        System.out.println(fila.element());

        System.out.println(fila.poll());
        System.out.println(fila.remove());
        System.out.println(fila.poll());
        System.out.println(fila.remove());
        System.out.println(fila.poll());
        System.out.println(fila.remove());
        System.out.println(fila.poll());
        System.out.println(fila.poll());

        // fila.size();
        // fila.clear();
        // fila.isEmpty();
        // fila.containts(...);
    }
    
}