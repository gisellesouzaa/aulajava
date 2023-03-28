package triatleta;

public abstract class Pessoa {
	
	private String nome;

	//Método construtor
	public Pessoa(String nome) {
		this.nome = nome;
	}


	//Get e Set
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//método abstrado/sem conteúdo
	public abstract void cansar(); 	

}
