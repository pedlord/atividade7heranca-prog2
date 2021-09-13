
public class Cliente {
	private String nome;
	
	public Cliente() {
	}
	public Cliente(String nome) {
		this.setNome(nome);
	}
	public String toString() {
		String cli = "nome: " + this.getNome();
		return cli;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
