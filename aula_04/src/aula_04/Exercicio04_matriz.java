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
				//'printf' para indicar formatação
				//'%d' será substituído pelas variáveis indicadas na frente e separadas por vírgula 
				System.out.printf("Digite a %dº nota do %dº participante: ", iColuna + 1, iLinha + 1 );
				matriz[iLinha][iColuna] = leia.nextFloat();
				somaNota += matriz[iLinha][iColuna];
			}
			
			vetorMediaAluno[iLinha] = somaNota/4;
			somaNota = 0.0f;
			//0.0f é inserido o f para indicar que é float. l para long
		}
		
		for (int iLinha = 0; iLinha < 10.0; iLinha++) {
			System.out.println("Media do aluno " + (iLinha+1) + ": ");
			System.out.println(vetorMediaAluno[iLinha]);
		}
		
		leia.close();

		/*
		 matriz = [linha/vetor][coluna]
		 matriz.lenght = descobre a quantidade de linhas
		 matriz[linha].lenght = descobre a quantidade de colunas
		 */
	}
}

