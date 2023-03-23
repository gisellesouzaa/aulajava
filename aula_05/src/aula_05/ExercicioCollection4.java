package aula_05;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ExercicioCollection4 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		Integer numeroProcurado = 0;

		Set<Integer> setNumeros = new HashSet<Integer>();
		
		setNumeros.add(5);
		setNumeros.add(2);
		setNumeros.add(1);
		setNumeros.add(3);
		setNumeros.add(4);
		setNumeros.add(9);
		setNumeros.add(7);
		setNumeros.add(8);
		setNumeros.add(10);
		setNumeros.add(6);
		
		System.out.print("Digite o número que você deseja encontrar: ");
		numeroProcurado = leia.nextInt();
		
		if (setNumeros.contains(numeroProcurado) == true)
			System.out.printf("O número %d foi encontrado! ", numeroProcurado);
		else
			System.out.printf("O número %d não foi encontrado! ", numeroProcurado);

		leia.close();

	}

}
