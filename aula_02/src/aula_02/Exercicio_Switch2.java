package aula_02;

import java.util.Scanner;

public class Exercicio_Switch2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String nome;
		int codigoCargo;
		float salario, novoSalario;

		System.out.println("Código Cargo \t Cargo \t Percentual do Reajuste\t");
        System.out.println("1\t Gerente \t 10% ");
        System.out.println("2\t Vendedor \t 7%");
        System.out.println("3\t Supervisor \t 9%");
        System.out.println("4\t Motorista \t 6%");
        System.out.println("5\t Estoquista \t 5%");
        System.out.println("6\t Técnico de TI \t 8% \n");
 
        System.out.println("Digite o Nome do Colaborador: ");
        nome = leia.next();
        
        System.out.println("Digite o Código do Cargo do Colaborador (de 1 a 6): ");
        codigoCargo = leia.nextInt();
        
        System.out.println("Digite o valor do salário: ");
        salario = leia.nextFloat();
        
        switch(codigoCargo) {
	        case 1:
				novoSalario = ((10 * salario) / 100) + salario;
		        System.out.println("Nome do colaborador: " + nome + " | Cargo: Gerente | Salário: " + novoSalario );
				break;
				
	        case 2:
				novoSalario = ((7 * salario) / 100) + salario;
		        System.out.println("Nome do colaborador: " + nome + " | Cargo: Vendedor | Salário: " + novoSalario );
				break;
				
	        case 3:
				novoSalario = ((9 * salario) / 100) + salario;
		        System.out.println("Nome do colaborador: " + nome + " | Cargo: Supervisor | Salário: " + novoSalario );
				break;
				
	        case 4:
				novoSalario = ((6 * salario) / 100) + salario;
		        System.out.println("Nome do colaborador: " + nome + " | Cargo: Motorista | Salário: " + novoSalario );
				break;
				
	        case 5:
				novoSalario = ((5 * salario) / 100) + salario;
		        System.out.println("Nome do colaborador: " + nome + " | Cargo: Estoquista | Salário: " + novoSalario );
				break;
				
	        case 6:
				novoSalario = ((8 * salario) / 100) + salario;
		        System.out.println("Nome do colaborador: " + nome + " | Cargo: Técnico de TI | Salário: " + novoSalario );
				break;
				
	        default:
    			System.out.println("Valor inválido");
        }    
        
        leia.close();

	}

}
