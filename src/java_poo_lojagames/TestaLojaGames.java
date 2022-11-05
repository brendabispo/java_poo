package java_poo_lojagames;

public class TestaLojaGames {

	public static void main(String[] args) {
	
	
		Jogo j1 = new Jogo(3, "Fifa 2023", 120.0f, 0, "Playstation 5");
		Jogo j2 = new Jogo(4, "Black", 100.0f, 0, "XBOX Series S");
	
		j1.visualizar();
		j2.visualizar();
		
		Console c1 = new Console(5, "Playstation 5", 4000.0f, 2021, "Playstation", 828, true);
		Console c2 = new Console(6, "XBOX Series S", 3800.0f, 2021, "XBOX", 528, false);
	
		c1.visualizar();
		c2.visualizar();
	}

}
