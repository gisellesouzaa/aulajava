package aula_01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio_03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		
		//máscara para formatação da vírgula:
		DecimalFormat df = new DecimalFormat("###,###,##0.00");
		
		System.out.println("Digite o valor do salário bruto: R$ ");
		salarioBruto = leia.nextFloat();
		
		System.out.println("Digite o valor do adicional notuno: R$ ");
		adicionalNoturno = leia.nextFloat();
		
		System.out.println("Digite o valor das horas extras: R$ ");
		horasExtras = leia.nextFloat();
		
		System.out.println("Digite o valor dos descontos: R$ ");
		descontos = leia.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
		
		System.out.println("O valor do sálario liquido é R$ " + df.format(salarioLiquido));
		
	}

}
