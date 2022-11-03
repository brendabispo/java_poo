package java_poo_lojagames;

import java_poo_funcionario.Funcionario;

public class LojaDeGames {

	private int codigoProduto;
	private String nomeProduto;
	private float precoUnitarioVenda;
	private int quantidadeEmVenda;
	private int quantidadeEmEstoque;
	private String categoriaProduto;
	private String formaPagamento;
	private int numeroDeFuncionarios;
	private float valorCompraFornecedor;
	
	public LojaDeGames(int codigoProduto, String nomeProduto, float precoUnitarioVenda, int quantidadeEmVenda,
			int quantidadeEmEstoque, String categoriaProduto, String formaPagamento, int numeroDeFuncionarios, float valorCompraFornecedor) {
		super();
		this.codigoProduto = codigoProduto;
		this.nomeProduto = nomeProduto;
		this.precoUnitarioVenda = precoUnitarioVenda;
		this.quantidadeEmVenda = quantidadeEmVenda;
		this.quantidadeEmEstoque = quantidadeEmEstoque;
		this.categoriaProduto = categoriaProduto;
		this.formaPagamento = formaPagamento;
		this.numeroDeFuncionarios = numeroDeFuncionarios;
		this.valorCompraFornecedor = valorCompraFornecedor;
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

	public int getQuantidadeEmVenda() {
		return quantidadeEmVenda;
	}

	public void setQuantidadeEmVenda(int quantidadeEmVenda) {
		this.quantidadeEmVenda = quantidadeEmVenda;
	}

	public int getQuantidadeEmEstoque() {
		return quantidadeEmEstoque;
	}

	public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
		this.quantidadeEmEstoque = quantidadeEmEstoque;
	}

	public String getCategoriaProduto() {
		return categoriaProduto;
	}

	public void setCategoriaProduto(String categoriaProduto) {
		this.categoriaProduto = categoriaProduto;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}
	
	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	
	public int getNumeroDeFuncionarios() {
		return numeroDeFuncionarios;
	}

	public void setNumeroDeFuncionarios(int numeroDeFuncionarios) {
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}

	public float getValorCompraFornecedor() {
		return valorCompraFornecedor;
	}
	
	public void setValorCompraFornecedor(float valorCompraFornecedor) {
		this.valorCompraFornecedor = valorCompraFornecedor;
	}

	
	public void visualizar() {
		System.out.println("\n=======================================\n");
		System.out.println("Dados da Loja");
		System.out.println("\n=======================================");
		System.out.println("\nCódigo do Produto: " + this.codigoProduto );
		System.out.println("Nome do Produto: " + this.nomeProduto);
		System.out.println("Preço Unitário: " + this.precoUnitarioVenda);
		System.out.println("Quantidade em Venda: " + this.quantidadeEmVenda);
		System.out.println("Quantidade em Estoque: " + this.quantidadeEmEstoque);
		System.out.println("Categoria: " + this.categoriaProduto);
		System.out.println("Forma de Pagamento: " + this.formaPagamento);
		System.out.println("Número de Funcionários: " + this.numeroDeFuncionarios);
		System.out.println("Valor de Compra com Fornecedor: " + this.valorCompraFornecedor);
			
	}
}
