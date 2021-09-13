
public class principal {
	public static void main(String args[]) {
		Animal camelo = new Animal("camelo", 150, 4, "Amarelo", "Terra", 2.0);
		Peixe tubarao = new Peixe("Tubarão", 300, 0, "Cinzento", "Mar", 1.5, "Barbatanas e cauda");
		Mamifero urso = new Mamifero("Urso-do-Canadá", 180, 4, "Vermelho", "Terra", 0.5, "mel");
		System.out.println("Zoo:");
		System.out.println(camelo.toString() + tubarao.toString() + urso.toString());
	}
}
