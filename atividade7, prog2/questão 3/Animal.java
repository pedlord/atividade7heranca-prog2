
public class Animal {
	private String nome;
	private int comprimento;
	private int numero_de_patas;
	private String cor;
	private String ambiente;
	private double velocidade;
	public Animal(String nome, int comprimento, int numero_de_patas, String cor, String ambiente, double velocidade) {
		this.setNome(nome);
		this.setComprimento(comprimento);
		this.setNumero_de_patas(numero_de_patas);
		this.setCor(cor);
		this.setAmbiente(ambiente);
		this.setVelocidade(velocidade);
	}
	@Override
	public String toString() {
		String animal = "-----------------------------" + "\n" +
						"Animal: " + this.getNome() + "\n" +
						"comprimento: " + this.getComprimento() + " cm" + "\n" +
						"patas:" + this.getNumero_de_patas() + "\n" +
						"cor: " + this.getCor() + "\n" +
						"ambiente: " + this.getAmbiente() + "\n" +
						"velocidade: " + this.getVelocidade() + " m/s"  + "\n";
		return animal;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getComprimento() {
		return comprimento;
	}
	public void setComprimento(int comprimento) {
		this.comprimento = comprimento;
	}
	public int getNumero_de_patas() {
		return numero_de_patas;
	}
	public void setNumero_de_patas(int numero_de_patas) {
		this.numero_de_patas = numero_de_patas;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getAmbiente() {
		return ambiente;
	}
	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}
	public double getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	
}
