
public class Mamifero extends Animal {
	private String alimento;
	
	public Mamifero(String nome, int comprimento, int numero_de_patas, String cor, String ambiente, double velocidade, String alimento) {
		super(nome, comprimento, numero_de_patas, cor, ambiente, velocidade);
		this.setAlimento(alimento);
	}
	@Override
	public String toString() {
		String mamifero = "-----------------------------" + "\n" +
					"Animal: " + this.getNome() + "\n" +
					"comprimento: " + this.getComprimento() + " cm" + "\n" +
					"patas: " + this.getNumero_de_patas() + "\n" +
					"cor: " + this.getCor() + "\n" +
					"ambiente: " + this.getAmbiente() + "\n" +
					"velocidade: " + this.getVelocidade() + " m/s" + "\n" +
					"alimento: " + this.getAlimento() + "\n" +
					"-----------------------------"  + "\n";
		return mamifero;
	}
	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}
	
}
