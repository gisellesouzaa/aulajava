package aula_01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Aula_01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double numero1, numero2;
		String nome;
		
		//máscara para formatação da vírgula
		DecimalFormat df = new DecimalFormat("###,###,##0.00");
		
		System.out.println("Digite o primeiro número: ");
		numero1 = leia.nextDouble();
		
		System.out.println("Digite o segundo número: ");
		numero2 = leia.nextDouble();
		
		//Sem parenteses para apenas concatenar:
		System.out.println("Concatenação: " + numero1 + numero2);
		
		//Entre parenteses para calcular:
		//Aplicando a máscara de formatação df.format()
		System.out.println("Soma: " + (numero1 + numero2));
		System.out.println("Subtração: " + (numero1 + numero2));
		System.out.println("Divisão: " + (numero1 + numero2));
		
		System.out.println("Multiplicação: " + df.format((numero1 + numero2)));
		System.out.println("Potência: " +  df.format(Math.pow(numero1, numero2)));
		System.out.println("Raíz Quadrada: " +  df.format(Math.sqrt(numero1)));


	}

}
