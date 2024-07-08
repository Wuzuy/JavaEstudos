package generics;

public class ParesTeste {
	public static void main(String[] args) {
		
		Pares<Integer, String> resultadoCompra = new Pares<>();
		
		resultadoCompra.adicionar(4, "Thiago");
		resultadoCompra.adicionar(3, "Fernando");
		resultadoCompra.adicionar(1, "Ana");
		resultadoCompra.adicionar(5, "Bia");
		resultadoCompra.adicionar(7, "Pedro");
		resultadoCompra.adicionar(8, "Augusto");
		resultadoCompra.adicionar(9, "Mathias");
		resultadoCompra.adicionar(6, "Matheus");
		resultadoCompra.adicionar(2, "Fulano");
		
		System.out.println(resultadoCompra.getValor(1));
		System.out.println(resultadoCompra.getValor(2));
		System.out.println(resultadoCompra.getValor(3));
		System.out.println(resultadoCompra.getValor(4));
	}
}