package aula_01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float salario, abono, novosalario;
		
		//máscara para formatação da vírgula:
		DecimalFormat df = new DecimalFormat("###,###,##0.00");
		
		System.out.println("Digite o valor do salário: R$ ");
		salario = leia.nextFloat();
		
		System.out.println("Digite o valor do abono: R$ ");
		abono = leia.nextFloat();
		
		novosalario = (salario + abono);
		
		System.out.println("O valor do novo salário é R$ " + df.format(novosalario));

	}

}
