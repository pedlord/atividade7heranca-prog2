//atributo Cliente e metodo getCLiente criados para poder associar as classes Cliente e ContaCorrente
public class ContaCorrente {
	protected float saldo;
	private Cliente cliente;
	
	public ContaCorrente() {
	}
	
	public ContaCorrente(float valor, Cliente cliente) {
		this.cliente = cliente;
		this.depositar(valor);
	}
	
	public Cliente getCliente() {
		return this.cliente;
	}
	
	public void depositar(float valor) {
		this.saldo = this.saldo + valor;
	}
	public boolean sacar(float valor) {
		if ((this.saldo > 0) & (this.saldo >= valor)) {
			this.saldo = this.saldo - valor;
			return true;
		}
		else {
			return false;
		}
	}
	public String toString() {
		String cc = "saldo: " + this.saldo;
		return cc;
	}
	public boolean tranferir(ContaCorrente conta) {
		if (this.saldo > 0) {
			float transf = this.saldo;
			conta.depositar(transf);
			this.sacar(transf);
			return true;
		}
		else {
			return false;
		}
	}

}
