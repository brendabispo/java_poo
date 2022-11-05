package java_poo_funcionario;

public class Vendedor extends Funcionario{

	private String departamento;

	public Vendedor(int id, String nome, String dataNascimento, String email, String telefone, float salario, String departamento) {
		super(id, nome, dataNascimento, email, telefone, salario);
		
		this.departamento = departamento;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public void visualizar() {
		super.visualizar();
		System.out.println("Departamento: " + this.departamento);
	}
	
	
	
}
