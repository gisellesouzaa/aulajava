package aula_05;

import java.util.ArrayList;
import java.util.Scanner;

public class ExercicioCollection1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		ArrayList<String> cores = new ArrayList<String>();
		
		for(int contador = 1; contador <= 5; contador ++) {
			System.out.printf("Digite a %dª uma cor: ", contador);
			cores.add(leia.next());
		}
		
		System.out.print("Lista com todas as cores adicionadas: \n");
		
		for(var cor : cores)
			System.out.println(cor);
		
		System.out.print("\nLista das cores ordenadas: \n");
		cores.sort(null);
		
		for(var cor : cores)
			System.out.println(cor);
	
		leia.close();
	}
}
