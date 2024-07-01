package colecoes;

import java.util.HashSet;

public class ConjuntoBaguncado {
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) {
        HashSet conjunto = new HashSet();
        conjunto.add(1.2);
        conjunto.add('t');
        System.out.println("Tamanho do conjunto é: " + conjunto.size());
        conjunto.add(1.2);
        conjunto.add(1.3);
        System.out.println("O tamanho do conjunto agora é: " + conjunto.size());
        System.out.println(conjunto);
    }

}
