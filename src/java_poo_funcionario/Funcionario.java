package java_poo_funcionario;

public class Funcionario {
	
	private int id;
	private String nome;
	private String dataNascimento;
	private String email;
	private String telefone;
	private float salario;
	
	public Funcionario(int id, String nome, String dataNascimento, String email, String telefone, float salario) {
		super();
		this.id = id;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.email = email;
		this.telefone = telefone;
		this.salario = salario;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	
	public void visualizar() {
		System.out.println("\n=======================================\n");
		System.out.println("Dados do Funcionário");
		System.out.println("\n=======================================");
		System.out.println("\nID: " + this.id);
		System.out.println("Nome: " + this.nome);
		System.out.println("Data de nascimento: " + this.dataNascimento);
		System.out.println("E-mail: " + this.email);
		System.out.println("Telefone: " + this.telefone);
		System.out.println("Salário: " + this.salario);
	}

}
