package lambdas;

import java.util.function.Function;

public class Funcao {

    public static void main(String[] args) {
        
        Function<Integer, String> parOuImpar = 
        num -> num % 2 == 0 ? "Par" : "Ímpar";

        System.out.println(parOuImpar.apply(5));

        Function<String, String> empolgado =
        valor -> valor + "!!!";
        
        Function<String, String> oResultadoE =
        valor -> "O Resultado é: " + valor + ". Parabéns";

        String resultadoFinal = 
        parOuImpar.andThen(oResultadoE).andThen(empolgado).apply(5);

        System.out.println(resultadoFinal);
    }
    
}