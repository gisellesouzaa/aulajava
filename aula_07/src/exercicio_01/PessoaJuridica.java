package exercicio_01;

public class PessoaJuridica extends Cliente{
	
	private String cnpj;
	private String representanteNome;

	public PessoaJuridica(int id, String nome, String telefone, String endereco, String cnpj, String representanteNome) {
		super(id, nome, telefone, endereco);
		this.cnpj = cnpj;
		this.representanteNome = representanteNome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getRepresentanteNome() {
		return representanteNome;
	}

	public void setRepresentanteNome(String representanteNome) {
		this.representanteNome = representanteNome;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("CNPJ: " + this.cnpj);
		System.out.println("Representante: " + this.representanteNome);
	}

}
