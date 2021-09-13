
public class VIP extends Ingresso {
	private double adicional = 0.8;

	@Override
	public double imprimeValor() {
		return super.imprimeValor() + this.adicional * super.imprimeValor();
	}
}
