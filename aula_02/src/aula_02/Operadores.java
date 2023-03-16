package aula_02;

public class Operadores {

	public static void main(String[] args) {
		int n1 = 2, n2 = 2;
		
		System.out.println("---- Operadores Unários / soma-se mais 1 -----");
		
		System.out.println("Valor N1: " + n1);
		//No pré incremento o valor já atualiza autómaticamente.
		System.out.println("N1 - Pré Incremento: " + (++ n1));
		System.out.println("Valor atual N1: " + n1);
		//No pós incremento o valor é atualizado posteriormente
		System.out.println("N1 - Pós Incremento: " + (n1 ++));
		System.out.println("Valor atual N1: " + n1);
		
		System.out.println("----");
	
		System.out.println("Valor N2: " + n2);
		System.out.println("N2 - Pré Decremento: " + (-- n2));
		System.out.println("Valor atual N2: " + n2);
		System.out.println("N2 - Pós Incremento: " + (n2--));
		System.out.println("Valor atual N2: " + n2);

	}

}
