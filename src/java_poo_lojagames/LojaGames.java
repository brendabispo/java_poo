package java_poo_lojagames;

import java_poo_funcionario.Funcionario;

public class LojaGames {

	private int codigoProduto;
	private String nomeProduto;
	private float precoUnitarioVenda;
	private int anoLancamento;
	
	public LojaGames(int codigoProduto, String nomeProduto, float precoUnitarioVenda, int anoLancamento) {
		super();
		this.codigoProduto = codigoProduto;
		this.nomeProduto = nomeProduto;
		this.precoUnitarioVenda = precoUnitarioVenda;
		this.anoLancamento = anoLancamento;
	}

	public int getCodigoProduto() {
		return codigoProduto;
	}

	public void setCodigoProduto(int codigoProduto) {
		this.codigoProduto = codigoProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public float getPrecoUnitarioVenda() {
		return precoUnitarioVenda;
	}

	public void setPrecoUnitarioVenda(float precoUnitarioVenda) {
		this.precoUnitarioVenda = precoUnitarioVenda;
	}

	public int getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public void visualizar() {
		System.out.println("\n=======================================\n");
		System.out.println("Dados da Loja");
		System.out.println("\n=======================================");
		System.out.println("\nCódigo do Produto: " + this.codigoProduto );
		System.out.println("Nome do Produto: " + this.nomeProduto);
		System.out.println("Preço Unitário: " + this.precoUnitarioVenda);
		System.out.println("Ano de Lançamento: " + this.anoLancamento);
	}
}
