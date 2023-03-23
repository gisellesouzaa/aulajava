package aula_05;

import java.util.ArrayList;
import java.util.Scanner;

public class ExercicioCollection2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Integer numeroProcurado = 0; 
		
		ArrayList<Integer> colecaoNumeros = new ArrayList<Integer>();
		
		colecaoNumeros.add(2);
		colecaoNumeros.add(5);
		colecaoNumeros.add(1);
		colecaoNumeros.add(3);
		colecaoNumeros.add(4);
		colecaoNumeros.add(9);
		colecaoNumeros.add(7);
		colecaoNumeros.add(8);
		colecaoNumeros.add(10);
		colecaoNumeros.add(6);
		
		System.out.print("Digite o número que você deseja encontrar: ");
		numeroProcurado = leia.nextInt();

		// .contains fala se existe ou não
		// .indexOf fala o indice
		if(colecaoNumeros.contains(numeroProcurado))
			System.out.printf("O número %d está localizado na posição: %d", numeroProcurado, colecaoNumeros.indexOf(numeroProcurado));
		else
			System.out.printf("O número %d não foi encontrado!", numeroProcurado);

		leia.close();
		
	}
}
