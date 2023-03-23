package aula_04;

import java.util.Arrays;
import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		//Criar um vetor com valores:
		int vetorInteiros[] = {4, 5, 7, 6, 10, 1, 3, 2, 9, 8}, numero;
		
		//Criar um vetor valores, com 5 posições
		float[] vetorFloat = new float[5];
		
		System.out.println("Digite um numero: ");
		numero = leia.nextInt();
		
		//vetorInteiros.length é para verificar o tamanho atual do vetor
		//Para pesquisar um valor especifico dentro do vetor: 
		for (int contador = 0; contador < vetorInteiros.length; contador++) {
			 
			if (vetorInteiros[contador] == numero)
			System.out.println("Posição [" + contador + "] = " + vetorInteiros[contador]);
		}
		
		//Para atribuir valores para dentro do vetor Float
		for (int contador = 0; contador < vetorFloat.length; contador++) {
			System.out.println("Digite um valor para a posição [" + contador + "]: ");
			vetorFloat[contador] = leia.nextFloat();
		}
		
		//Para mostrar dados do vetor Float
		for (int contador = 0; contador < vetorFloat.length; contador++) {
			System.out.println("Posição [" + contador + "] = " + vetorFloat[contador]);
		}
		
		System.out.println("Mostrar a estrutura: ");
		for (float vfloat : vetorFloat) {
			System.out.println(vfloat);
		}
 
		//Ordenar o array com sort
		Arrays.sort(vetorInteiros);
		
		//for i = maneira simplificada de mostrar valores dentro do vetor
		for (int vInt : vetorInteiros) {
			System.out.println(vInt);
		}
		}
	}


