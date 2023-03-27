package exercicio_01;

public class TestaCliente {
	
	public static void main(String[] args) {
		
		System.out.println("//Instanciando 2 Objetos da Classe Cliente;");
		
		Cliente cliente1 = new Cliente(001, "Branda Soares", "11 98756-9863", "Rua Pink, 05 - São Paulo/SP");
		cliente1.visualizar();
		
		Cliente cliente2 = new Cliente(002, "Carolina Brandão", "11 9688-3597", "Rua Blue, 08 - São Paulo/SP");
		cliente2.visualizar();
		
		// ----------- //
		System.out.println("\n //Instanciando 2 Objetos da subclasse Pessoa Fisica: ");
		
		PessoaFisica pf1 = new PessoaFisica(003, "Gabriel Alemão", "11 98567-5226", "Rua Yellow, 18 - São Paulo/SP", "389.965.369-36");
		pf1.visualizar();
		
		PessoaFisica pf2 = new PessoaFisica(004, "Rafaela Brigato", "11 9241-8756", "Rua Orange, 22 - São Paulo/SP", "697.695.987-36");
		pf2.visualizar();
		
		// ----------- //
		System.out.println("\n //Instanciando 2 Objetos da subclasse Pessoa Juridica: ");
		
		PessoaJuridica pj1 = new PessoaJuridica(101, "Lojas 100", "11 4004-7896", "Rua Margarida, 1000 - Campinas/SP", "36369000136", "Maria José");
		pj1.visualizar();
		
		PessoaJuridica pj2 = new PessoaJuridica(102, "Magazine Vende Tudo", "11 4004-8596", "Rua do Girasol, 505 - Campinas/SP", "36000223566", "João Ribeiro");
		pj2.visualizar();
	}

}
