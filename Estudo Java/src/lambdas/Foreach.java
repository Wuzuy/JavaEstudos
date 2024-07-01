package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {

    public static void main(String[] args) {
        
        List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");
        
        System.out.println("1. Forma tradicional:");
        for(String nome: aprovados){
            System.out.println(nome);
        }
        
        System.out.println("\n2. Lambda #0...");
        aprovados.forEach((nome) -> {System.out.println(nome + "zin");});

        System.out.println("\n3. Method Reference #01");        
        aprovados.forEach(nome -> meuImprimir(nome)); // para cada aprovado, imprima na saída do sistema

        System.out.println("\n3. Method Reference #02");
        aprovados.forEach(Foreach::meuImprimir);
    }
    static void meuImprimir(String nome) {
        System.out.println("Oi! Meu nome é: "+ nome);
    }    
}