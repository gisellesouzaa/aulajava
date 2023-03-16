package aula_02;

import java.util.Scanner;

public class Exercicio_Switch1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int produto, quantidade, valorTotal;

		System.out.println("Código \t Produto \t Preço Unitário\t");
        System.out.println("1\t Cachorro Quente \t R$ 10.00\t");
        System.out.println("2\t X-Salada \t R$ 15.00\t");
        System.out.println("3\t X-Bacon \t R$ 18.00\t");;
        System.out.println("4\t Bauru \t\t R$ 12.00\t");
        System.out.println("5\t Refrigerante \t R$ 8.00\t");
        System.out.println("6\t Suco de laranja \t R$ 13.00\t\n");
        
        System.out.println("Digite um número do item (de 1 a 6): ");
        produto = leia.nextInt();
        
        System.out.println("Digite a quantidade que deseja comprar desse item: ");
        quantidade = leia.nextInt();
        
        switch(produto) {
	        case 1:
				valorTotal = 10 * quantidade;
		        System.out.println("Produto: Cachorro Quente | Valor total da compra: " + valorTotal);
				break;
				
	        case 2:
				valorTotal = 15 * quantidade;
		        System.out.println("Produto: X-Salada | Valor total da compra: " + valorTotal);
				break;
				
	        case 3:
				valorTotal = 18 * quantidade;
		        System.out.println("Produto: X-Bacon | Valor total da compra: " + valorTotal);
				break;
				
	        case 4:
				valorTotal = 12 * quantidade;
		        System.out.println("Produto: Bauru | Valor total da compra: " + valorTotal);
				break;
				
	        case 5:
				valorTotal = 8 * quantidade;
		        System.out.println("Produto: Refrigerante | Valor total da compra: " + valorTotal);
				break;
				
	        case 6:
				valorTotal = 13 * quantidade;
		        System.out.println("Produto: Suco de laranja | Valor total da compra: " + valorTotal);
				break;
	        default:
    			System.out.println("Valor inválido");
        }    
        
        leia.close();
		
	}

}
