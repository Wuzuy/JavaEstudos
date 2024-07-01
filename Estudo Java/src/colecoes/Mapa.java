package colecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        
        Map<Integer, String> usuarios = new HashMap<>();

        usuarios.put(1, "Roberto");
        usuarios.put(1, "Ricardo");
        usuarios.put(2, "Tiago");
        usuarios.put(3, "Roberto");

        System.out.println(usuarios.size());

        if(usuarios.isEmpty()){
            System.out.println("A lista está vazia!");   
        }else {
            for (int chave: usuarios.keySet()) {
                System.out.println(chave);
            }
            for (String valor: usuarios.values()){
                System.out.println(valor);
            }
            System.out.println("COMEÇANDO AGORA O INFORMATIVO DE NOMES CADRASTADOS!");
            for (Map.Entry<Integer, String> registro : usuarios.entrySet()) {
                System.out.println("Nome: " + registro.getKey());
                System.out.println("ID : " + registro.getValue());
                System.out.println("--------");
            }
        }
    }   
}