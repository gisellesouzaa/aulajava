package exercicio_03;

public class Produto {
	
		private int id;
		private String nome;
		private int versao;
		private String produtora;
		private int anoLancamento;
		private float preco;
		
		public Produto(int id, String nome, int versao, String produtora, int anoLancamento, float preco) {
			this.id = id;
			this.nome = nome;
			this.versao = versao;
			this.produtora = produtora;
			this.anoLancamento = anoLancamento;
			this.preco = preco;
		}


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

		public int getVersao() {
			return versao;
		}

		public void setVersao(int versao) {
			this.versao = versao;
		}

		public String getProdutora() {
			return produtora;
		}

		public void setProdutora(String produtora) {
			this.produtora = produtora;
		}

		public int getDataLancamento() {
			return anoLancamento;
		}

		public void setDataLancamento(int dataLancamento) {
			this.anoLancamento = dataLancamento;
		}

		public float getPreco() {
			return preco;
		}

		public void setPreco(float preco) {
			this.preco = preco;
		}

		public void visualizar() {

			System.out.println("----------Dados do Produto-----------");
			System.out.println("Id: " + this.id);
			System.out.println("Nome: " + this.nome);
			System.out.println("Versão: " + this.versao);
			System.out.println("Produtora: " + this.produtora);
			System.out.println("Ano de Lançamento: " + this.getDataLancamento());
			System.out.println("Preço: " + this.preco);
		
	}

}
