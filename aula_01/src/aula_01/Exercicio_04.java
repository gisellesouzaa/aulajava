package aula_01;

import java.util.Scanner;

public class Exercicio_04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		float n1, n2, n3, n4, resultado;
		
		System.out.println("Digite o valor do n1: ");
		n1 = leia.nextFloat();
		
		System.out.println("Digite o valor do n2: ");
		n2 = leia.nextFloat();
		
		System.out.println("Digite o valor do n3: ");
		n3 = leia.nextFloat();
		
		System.out.println("Digite o valor do n4: ");
		n4 = leia.nextFloat();
		
		resultado = (n1 * n2) - (n3 * n4);
		
		System.out.println("Resultado: " + resultado);
	}

}
