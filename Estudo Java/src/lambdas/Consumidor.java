package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
    
    public static void main(String[] args) {
        
        Consumer<Produto> imprimir = p -> System.out.println(p.nome);

        Produto p1 = new Produto ("Caneta", 12.34, 0.15);
        imprimir.accept(p1);

        Produto p2 = new Produto("Lapis", 3.99, 0.20);
        Produto p3 = new Produto("Borracha", 3.99, 0);
        Produto p4 = new Produto("Caderno", 49.99, 0.25);
        Produto p5 = new Produto("Agenda", 29.99, 0.15);

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);

        produtos.forEach(imprimir);

        produtos.forEach(p -> System.out.println(p.preco - (1*p.desconto)));

        produtos.forEach(System.out::println);
    }
    
}