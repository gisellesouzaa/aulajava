package exercicio_01;

public class Cliente {

	private int id;
	private String nome;
	private String telefone;
	private String endereco;
	
	//Método construtor
	public Cliente(int id, String nome, String telefone, String endereco) {
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
	}

	//Métodos Get e Set
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	//Método visualizar
	public void visualizar() {
		System.out.println("\n----------Dados do Cliente-----------");
		System.out.println("Id: " + this.id);
		System.out.println("Nome: " + this.nome);
		System.out.println("Telefone: " + this.telefone);
		System.out.println("Endereço: " + this.endereco);
	
}
	
}
