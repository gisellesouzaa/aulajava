package aula_04;

import java.util.Scanner;

public class Exercicio3_diagonais {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int[][] matriz = new int[3][3];
		int somaPrincipal = 0, somaSecundaria = 0;
		String diagonalPrincipal = "", diagonalSecundaria = "";
			
		for (int iLinha = 0; iLinha < matriz.length; iLinha++) {
			
		
			for (int iColuna = 0; iColuna < matriz.length; iColuna++) {
				
				System.out.println("Digite um número: ");
				matriz[iLinha][iColuna] = leia.nextInt();
			}
	}

		for (int iLinha = 0; iLinha < matriz.length; iLinha++) {
			diagonalPrincipal += matriz[iLinha][iLinha] + " ";
			somaPrincipal += matriz[iLinha][iLinha];
			//poderia trocar o nome 'iLinha' por 'contador'
		
			diagonalSecundaria += matriz[iLinha][matriz.length - 1 - iLinha] + " ";
			somaSecundaria += matriz[iLinha][matriz.length - 1 - iLinha];
		}
		
		System.out.println(diagonalPrincipal);
		System.out.println(diagonalSecundaria);
		System.out.println(somaPrincipal);
		System.out.println(somaSecundaria);


		}

}
