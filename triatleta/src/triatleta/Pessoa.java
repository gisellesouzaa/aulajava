package triatleta;

public abstract class Pessoa {
	
	private String nome;

	//M�todo construtor
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
	
	//m�todo abstrado/sem conte�do
	public abstract void cansar(); 	

}
