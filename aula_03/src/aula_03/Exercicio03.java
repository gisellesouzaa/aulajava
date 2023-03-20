package aula_03;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int idade, parada = 1, idadeMenor21 = 0, idadeMaior50 = 0; 
		
		while (parada != 0) {
//			System.out.println("Digite sua idade: ");
			idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "))  ;
			
			if (idade < 0) {
//				System.out.println("Programa finalizado!");		
				JOptionPane.showMessageDialog(null, "Programa finalizado!");
				break;
			} else if (idade < 21) {
				idadeMenor21++;
			} else if (idade > 50) {
				idadeMaior50++;
			} 
		}
		System.out.println("Total de pessoas menores de 21 anos:" + idadeMenor21);
		System.out.println("Total de pessoas maiores de 50 anos:" + idadeMaior50);		
				
		leia.close();
	}

}
