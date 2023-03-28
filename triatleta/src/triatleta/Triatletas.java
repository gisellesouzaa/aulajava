package triatleta;

	public class Triatletas extends Pessoa implements Ciclista, Nadador, Corredor {

		public Triatletas(String nome) {
			super(nome);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void aquecer() {
			System.out.print("Aquecendo...");
			
		}

		@Override
		public void correr() {
			System.out.print("Correndo...");			
		}

		@Override
		public void nadar() {
			System.out.print("Nadando...");			
		}

		@Override
		public void pedalar() {
			System.out.print("Pedalando...");			
		}

		@Override
		public void cansar() {
			System.out.print("Cansou!");			
			
		}
		
	}

