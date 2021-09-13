
public class Peixe extends Animal {
	private String caracteristica;
	public Peixe (String nome, int comprimento, int numero_de_patas, String cor, String ambiente, double velocidade, String caracteristica) {
		super(nome, comprimento, numero_de_patas, cor, ambiente, velocidade);
		this.setCaracteristica(caracteristica);
	}
	@Override
	public String toString() {
		String peixe = "-----------------------------" + "\n" +
						"Animal: " + this.getNome() + "\n" +
						"comprimento: " + this.getComprimento() + " cm" + "\n" +
						"patas:" + this.getNumero_de_patas() + "\n" +
						"cor: " + this.getCor() + "\n" +
						"ambiente: " + this.getAmbiente() + "\n" +
						"velocidade: " + this.getVelocidade() + " m/s" + "\n" +
						"caracteristica: " + this.getCaracteristica()  + "\n";
		return peixe;
	}
	public String getCaracteristica() {
		return caracteristica;
	}
	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}
	
}
