package java_poo_lojagames;

public class TestaLojaGames {

	public static void main(String[] args) {
	
		LojaDeGames loja1 = new LojaDeGames(1, "Polystation", 700.0f, 2, 5, "Consoles", "Cartão", 5, 400.0f);
		LojaDeGames loja2 = new LojaDeGames(2, "Playstation 5", 4500.0f, 1, 10, "Consoles", "Cartão", 10, 2500.0f);
	
		loja1.visualizar();
		loja2.visualizar();
	
	}

}
