
public class ContaEspecial extends ContaCorrente {
	private float limite;
	
	public ContaEspecial(float valor, Cliente cliente, float limite) {
		super(valor, cliente);
		this.limite = limite;
	}
	public boolean sacar(float valor) {
		if ((this.saldo > 0) & (this.saldo >= valor)) {
			this.saldo = this.saldo - valor;
			return true;
		}
		else if ((this.saldo <= 0) & (this.limite >= valor)) {
			this.limite = this.limite - valor;
			this.saldo = this.saldo - valor;
			return true;
		}
		else {
			return false;
		}
	}
	public String toString() {
		String ce = super.toString() + "\n" + "limite: " + this.limite;
		return ce;
	}
}
