package aula_02;

import java.util.Scanner;

public class Exercicio_If1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.println("Digite o valor de A: ");
		a = leia.nextInt();
		
		System.out.println("Digite o valor de B: ");
		b = leia.nextInt();
		
		System.out.println("Digite o valor de C: ");
		c = leia.nextInt();
		
		if ((a + b) > c )
			System.out.println("A Soma de A + B é Maior do que C");
		
		else if ((a + b) < c )
			System.out.println("A Soma de A + B é Menor do que C");
		
		else if ((a + b) == c )
			System.out.println("A Soma de A + B é Igual a C");
		
		else 
			System.out.println("Valores inválidos");
		
		leia.close();
	}
}
