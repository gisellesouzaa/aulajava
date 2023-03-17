package aula_03;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numeroInicial, numeroFinal;
		
		System.out.println("Informa o ínicio do intervalo: ");
		numeroInicial = leia.nextInt();
		
		System.out.println("Informa o final do intervalo: ");
		numeroFinal = leia.nextInt();
		
		if(numeroInicial > numeroFinal) {
			System.out.println("Intervalo inválido! ");
			//Para finalizar a aplicação
			System.exit(0);
		}
		
		for(int contador = numeroInicial; contador <= numeroFinal; contador++) {
			
			if (contador%3 == 0 && contador%5 == 0)
				System.out.println(contador + " é múltiplo de 5 e 3");
		}
		leia.close();

	}

}
