
public class principalcontas {
	public static void main(String args[]) {
		Cliente novo = new Cliente();
		novo.setNome("Pedro");
		System.out.println("Conta Corrente");
		System.out.println(novo.toString());
		ContaCorrente conta = new ContaCorrente(50, novo);
		System.out.println(conta.toString());
		conta.sacar(50);
		System.out.println(conta.toString());
		conta.depositar(50);
		System.out.println(conta.toString());
		
		System.out.println("\nConta Corrente 2");
		Cliente outro = new Cliente("joao");
		ContaCorrente contajj = new ContaCorrente(0, outro);
		System.out.println(outro.toString());
		conta.tranferir(contajj);
		System.out.println(conta.toString());
		System.out.println(contajj.toString());
		
		System.out.println("\nConta Especial");
		ContaEspecial contae = new ContaEspecial(50, novo, 100);
		System.out.println(contae.toString());
		contae.sacar(50);
		System.out.println(contae.toString());
		contae.sacar(50);
		System.out.println(contae.toString());
		contae.sacar(50);
		System.out.println(contae.toString());
		
	}
}
