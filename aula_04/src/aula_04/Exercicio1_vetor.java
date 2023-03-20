package aula_04;

import java.util.Scanner;

public class Exercicio1_vetor {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		//Criar um vetor com valores:
		int vetorInteiros[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		int numero;
		boolean encontrou = false;
		
		System.out.println("Digite um numero para pesquisar: ");
		numero = leia.nextInt();
		
		//vetorInteiros.length é para verificar o tamanho atual do vetor
		//Para pesquisar um valor especifico dentro do vetor: 
		for (int contador = 0; contador < vetorInteiros.length; contador++) {
			 
			if (vetorInteiros[contador] == numero) {
			System.out.println("O número " + numero + " está localizado na posição: " + contador );
			encontrou = true;
			} 
		}
		if (encontrou == false) {
			System.out.println("O número " + numero + " não foi encontrado!");
		}
		
		leia.close();

	}

}
