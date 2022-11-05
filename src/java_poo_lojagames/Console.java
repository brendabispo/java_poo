package java_poo_lojagames;

public class Console extends LojaGames{

	private String marca;
	private int capacidadeEmGb;
	private boolean voltagem;
	
	public Console(int codigoProduto, String nomeProduto, float precoUnitarioVenda, int anoLancamento, String marca, int capacidadeEmGb,
			boolean voltagem) {
		super(codigoProduto, nomeProduto, precoUnitarioVenda, anoLancamento);
		
		this.marca = marca;
		this.capacidadeEmGb = capacidadeEmGb;
		this.voltagem = voltagem;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getCapacidadeEmGb() {
		return capacidadeEmGb;
	}
	public void setCapacidadeEmGb(int capacidadeEmGb) {
		this.capacidadeEmGb = capacidadeEmGb;
	}
	public boolean isVoltagem() {
		return voltagem;
	}
	public void setVoltagem(boolean voltagem) {
		this.voltagem = voltagem;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Marca: " + this.marca);
		System.out.println("Capacidade em GB: " + this.capacidadeEmGb);
		System.out.println("Voltagem: " + this.voltagem);
	}

}
