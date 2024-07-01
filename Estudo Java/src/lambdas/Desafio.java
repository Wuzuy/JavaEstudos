package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

    public static void main(String[] args) {

        Function<Produto, Double> precoDesconto = p1 -> p1.preco - (1 * p1.desconto);
        UnaryOperator<Double> imposto = preco -> 
        preco >= 2500 ? preco * 1085 : preco;

        UnaryOperator<Double> frete = preco -> 
        preco >= 3000 ? preco + 100 : preco;

        // UnaryOperator<Double> arredondar = preco -> Double.parseDouble(String.format("%.2f", preco));

        Function<Double, String> formatar = preco -> ("R$ "+ preco).replace(".", ",");

        Produto p1 = new Produto("iPad", 3235.89, 0.13);

        String preco = precoDesconto
        .andThen(imposto)
        .andThen(frete)
        // .andThen(arredondar)
        .andThen(formatar)
        .apply(p1);

        System.out.println("O preço final é: " + preco);

    }
    
    
}