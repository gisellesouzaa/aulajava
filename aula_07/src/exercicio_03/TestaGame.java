package exercicio_03;

public class TestaGame {

	public static void main(String[] args) {

			//LocalDate data = LocalDate.of(2020, 90, 20);

			// Produto(int id, String nome, int versao, String produtora, int anoLancamento, float preco)
			Produto g1 = new Produto(1, "Valorant", 3, "Riot Games", 2015, 1200.0f);
			Produto g2 = new Produto(2, "GTA", 2, "Games Good", 2011, 900.0f);

			
			g1.visualizar();
			g2.visualizar();
	}

}
