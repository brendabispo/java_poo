package java_poo_lojagames;

public class Jogo extends LojaGames{

	private String versaoConsole;

	public Jogo(int codigoProduto, String nomeProduto, float precoUnitarioVenda, int anoLancamento, String versaoConsole) {
		super(codigoProduto, nomeProduto, precoUnitarioVenda, anoLancamento);
		this.versaoConsole = versaoConsole;
	}

	public String getVersaoConsole() {
		return versaoConsole;
	}

	public void setVersaoConsole(String versaoConsole) {
		this.versaoConsole = versaoConsole;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Versão do Console: " + this.versaoConsole);
	}

}
