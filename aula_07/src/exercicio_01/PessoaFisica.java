package exercicio_01;

public class PessoaFisica extends Cliente {
	
	private String cpf;

	public PessoaFisica(int id, String nome, String telefone, String endereco, String cpf) {
		super(id, nome, telefone, endereco);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("CPF: " + this.cpf);
	}

}
