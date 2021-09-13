
public class camaroteSuperior extends VIP {
	private double adicionalCS = 0.2;
	@Override
	public double imprimeValor() {
		return super.imprimeValor() + this.adicionalCS * super.imprimeValor();
	}
}
