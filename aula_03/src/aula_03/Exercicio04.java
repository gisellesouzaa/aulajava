package aula_03;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int idade, sexo, categoria, contador = 0, pessoasBack = 0, 
				mulheresFront = 0, homensMobileMaior40 = 0, mulheresFullMenor30 = 0;
		char continua = 'S';
		
		while(continua == 'S') {

		System.out.println("Digite a sua Idade: ");
		idade = leia.nextInt();
		
		do {
		System.out.println("Digite o sexo (1-M | 2-F | 3-Outros): ");
		sexo = leia.nextInt();
		}while(sexo < 1 || sexo > 4);
		
		System.out.println("Digite a sua categoria: (1-Backend|2-Frontend|3-Mobile|4-FullStack)");
		categoria = leia.nextInt();
		
		contador ++;
		
		if(categoria == 1)
			pessoasBack ++;
		if(categoria == 2 && sexo == 2)
			mulheresFront ++;
		if(sexo == 1  && categoria == 3 && idade > 40)
			homensMobileMaior40 ++;
		if(sexo == 2  && categoria == 4 && idade < 30)
			mulheresFullMenor30 ++;
		
		
		System.out.println("Deseja continuar (S/N)?");
		continua = leia.next().toUpperCase().charAt(0);
		
		}
		
		System.out.println("Número de pessoas desenvolvedoras Backend: " + pessoasBack);
		System.out.println("Número de mulheres desenvolvedoras Frontend: " + mulheresFront);
		System.out.println("Número de homens desenvolvedores Mobile maiores de 40 anos: " + homensMobileMaior40);
		System.out.println("Número de mulheres desenvolvedoras FullStack menores de 30 anos: " + mulheresFullMenor30);

		leia.close();
	}

}
