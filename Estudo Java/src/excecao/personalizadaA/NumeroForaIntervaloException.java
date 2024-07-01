package excecao.personalizadaA;

public class NumeroForaIntervaloException extends RuntimeException {

    private final String nomeAtributo;
    public char[] getMessage;

    public NumeroForaIntervaloException(String nomeAtributo) {
        this.nomeAtributo = nomeAtributo;
    }
    @Override
    public String getMessage() {
        return String.format("O atributo %s está fora do intervalo", nomeAtributo);
    }
}
