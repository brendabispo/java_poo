package java_poo_funcionario;

public class Gerente extends Funcionario {

	private int numeroDeFuncionariosGerenciados;

	public Gerente(int id, String nome, String dataNascimento, String email, String telefone, float salario, int numeroDeFuncionariosGerenciados) {
		super(id, nome, dataNascimento, email, telefone, salario);
		
		this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
	}

	public int getNumeroDeFuncionariosGerenciados() {
		return numeroDeFuncionariosGerenciados;
	}

	public void setNumeroDeFuncionariosGerenciados(int numeroDeFuncionariosGerenciados) {
		this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Número de Funcionários Gerenciados: " + this.numeroDeFuncionariosGerenciados);
	}

	
	
}
