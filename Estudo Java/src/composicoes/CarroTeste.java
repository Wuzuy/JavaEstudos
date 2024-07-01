package composicoes;

public class CarroTeste {

    public static void main(String[] args) {
        Carro c = new Carro();

        System.out.println("Está ligado? " + c.estaLigado());
        c.ligar();
        System.out.println("Agora está ligado? " + c.estaLigado());
        System.out.println(c.motor.giros());
        
        c.acelerar();
        c.acelerar();
        c.frear();

        System.out.println(c.motor.giros());

        c.desligar();
    }
    
}