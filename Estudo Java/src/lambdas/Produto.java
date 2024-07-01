package lambdas;

public class Produto extends Object {

    final String nome;
    final double preco;
    final double desconto;
    public Produto(String nome, double preco, double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }
    @Override
    public String toString() {
        return "[" + nome + " Tem preço de: " + preco + ". O seu preço de desconto é: " + (preco - (1 * desconto)) + "]";
    }    
}