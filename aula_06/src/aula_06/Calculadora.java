package aula_06;

import java.util.Scanner;

import aula_06.calculos.Calculos;

public class Calculadora {

	// String[] args � o vetor com tudo que � necess�rio para iniciar a classe main.
	public static void main(String[] args) {
		
		//instanciando / importando m�todos que est�o em outros pacotes:
		Scanner leia = new Scanner(System.in);
		Calculos metodoCalculo = new Calculos();
		// para usar o metodo usar .metodoCalculo
		int opcao = 0;
		double numero1, numero2;
		
		while (true) {
			System.out.println("----------Menu-----------");
			System.out.println("1 - Soma");
			System.out.println("2 - Subtra��o");
			System.out.println("3 - Multiplica��o");
			System.out.println("4 - Divis�o");
			System.out.println("0 - Para sair");

			System.out.println("Qual a opera��o?");
			opcao = leia.nextInt();
			
			if (opcao == 0) {
				sobre(); //chamando o metodo sobre
				leia.close(); // 
				System.exit(0);
			}
			
			System.out.println("Digite o 1� numero?");
			numero1 = leia.nextDouble();
			
			System.out.println("Digite o 2� numero?");
			numero2 = leia.nextDouble();
		
			//Case lambida 
			switch(opcao) {
			case 1 -> System.out.println("Soma" + metodoCalculo.soma(numero1, numero2));
			case 2 -> System.out.println("Subtra��o" + metodoCalculo.subtracao(numero1, numero2));
			case 3 -> System.out.println("Multiplica��o" + metodoCalculo.multiplicacao(numero1, numero2));
			case 4 -> System.out.println("Divis�o" + metodoCalculo.divicao(numero1, numero2));
			default -> System.out.println("Op��o inv�lida");			
			}
		}			
	}
	
	public static void sobre() {
		System.out.println("--Calculadora com M�todos--");
		System.out.println("Giselle Souza");
	}
}
