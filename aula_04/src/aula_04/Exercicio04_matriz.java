package aula_04;

import java.util.Scanner;

public class Exercicio04_matriz {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		float[][] matriz = new float[10][4];
		float[] vetorMediaAluno = new float[10];
		float somaNota = 0;
		
		//Aluno - linhas
		for (int iLinha = 0; iLinha < 10.0; iLinha++) {
			//nota aluno - colunas
			for (int iColuna = 0; iColuna < 4.0; iColuna++) {
				System.out.println("Digite uma nota: ");
				matriz[iLinha][iColuna] = leia.nextFloat();
				somaNota += matriz[iLinha][iColuna];
			}
			
			vetorMediaAluno[iLinha] = somaNota/4;
			somaNota = 0;
		}
		
		for (int iLinha = 0; iLinha < 10.0; iLinha++) {
			System.out.println("Media do aluno " + (iLinha+1) + ": ");
			System.out.println(vetorMediaAluno[iLinha]);
		}
		
		leia.close();

	}
}

