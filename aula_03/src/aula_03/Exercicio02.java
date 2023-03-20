package aula_03;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero, numerosPares = 0, numerosImpares = 0;
		
		for(int contador = 1; contador <= 10; contador++) {
			System.out.println("Digite o " + (contador) + "º número: ");
			numero = leia.nextInt();
			
			if (numero % 2 == 0) {
			numerosPares++;
			} else {
			numerosImpares++;
			}
				
		}
		System.out.println("Total de números pares:" + numerosPares);
		System.out.println("Total de números pares:"  + numerosImpares);

		leia.close();

}
}
