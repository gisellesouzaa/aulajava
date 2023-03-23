package aula_05;

import java.util.ArrayList;
import java.util.Scanner;

public class Lista {

	public static void main(String[] args) {
		
//		int numero;
//		Integer objetoNumero;
//		Float numeroFloat;
		
		Scanner leia = new Scanner(System.in);
		
		ArrayList<Double> notas = new ArrayList<Double>();
		
		int opcao = 0;

		double nota = 0.0;

		do {
		System.out.println("-------------------------");
		System.out.println("1 - Cadastrar nota");
		System.out.println("2 - Listar todas as notas");
		System.out.println("3 - Buscar uma nota");
		System.out.println("4 - Remover uma nota");
		System.out.println("5 - Atualizar uma nota");
		System.out.println("6 - Sair");
		System.out.println("Digite uma opção do menu acima: ");
		
		opcao = leia.nextInt();

		switch (opcao) {
		
		case 1:
			System.out.println("----- Cadastrar nota ----- ");
			System.out.println("Digite uma nota: ");
			
			notas.add(leia.nextDouble());

			break;
		case 2:
			System.out.println("----- Listar notas ----- ");
			//isEmpty fala se está vazio
			if (notas.isEmpty()) {
				System.out.println("Não existe notas cadastradas!");

			} else {
			for(var eNota : notas)
				System.out.println(eNota);
			}
			
			break;
			
		case 3:
			System.out.println("----- Buscar uma nota -----");
			System.out.println("Digite uma nota: ");
			nota = leia.nextDouble();

			// .contains fala se existe ou não
			// .indexOf fala o indice
			if(notas.contains(nota))
				System.out.println("A nota está localizada na posição: " + notas.indexOf(nota));
			break;
			
		case 4:
			System.out.println("----- Remover uma nota -----");
			System.out.println("Digite uma nota: ");
			nota = leia.nextDouble();
			notas.remove(nota);
			break;
			
		case 5:
			System.out.println("----- Atualizar uma nota ----- ");
			
			System.out.println("Digite a nota atual: ");
			nota = leia.nextDouble();
			
			System.out.println("Digite a nova nota: ");
			var novaNota = leia.nextDouble();
			
			//.set troca o conteudo do item; set(nº indice, novoValor do indice)
			notas.set(notas.indexOf(nota), novaNota);

			break;
			
		default:
			if (opcao > 6)
			System.out.println("Opção invalida");

			break;
		}
		
		} while (opcao != 6);
		
		System.out.println("Programa Finalizado");

		
		leia.close();

	}


}
