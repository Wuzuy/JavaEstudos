package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {
    
    public static void main(String[] args) {
        
        Supplier<List<Object>> umLista = () -> Arrays.asList("Gab", "Tiago", "Guilherme", "Lucas", "Matheus");

        System.out.println(umLista.get());
    }
    
}