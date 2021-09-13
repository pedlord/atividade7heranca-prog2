import java.util.Scanner;

public class principalIngresso {
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner digito = new Scanner(System.in);
		while (true) {
			int n;
			System.out.println("digite 1 para Ingresso Normal ou 2 para VIP, ou 0 para sair:");
			n = digito.nextInt();
			if (n == 1) {
				Normal nor = new Normal();
				System.out.println(nor.imprimeIngressoNormal() + "\n");
			}
			else if (n == 2) {
				VIP v = new VIP();
				System.out.println("Ingresso VIP");
				System.out.println("digite 1 para Camarote Superior ou 2 para Camarote Inferior:");
				n = digito.nextInt();
				if (n == 1) {
					camaroteSuperior cams = new camaroteSuperior();
					System.out.println("VIP - Camarote Superior");
					System.out.println("Valor: " + cams.imprimeValor() + "\n");
				}
				else if (n == 2) {
					CamaroteInferior cami = new CamaroteInferior();
					cami.getLocalizacaoIngresso();
					System.out.println(cami.getLocalizacaoIngresso());
					System.out.println("Valor: " + v.imprimeValor() + "\n");
				}
			}
			else if (n ==0) {
				break;
			}
		}
	}
}
