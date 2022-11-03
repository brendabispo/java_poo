package java_poo_cliente;

public class Cliente {

	private int id;
	private String nome;
	private int idade;
	private String cpf;
	private String email;
	private String telefone;
	
	
	public Cliente(int id, String nome, int idade, String cpf, String email, String telefone) {
		
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.email = email;
		this.telefone = telefone;
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
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
	
	public void visualizar() {
		System.out.println("\n=======================================\n");
		System.out.println("Dados do Cliente");
		System.out.println("\n=======================================");
		System.out.println("\nID: " + this.id);
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);
		System.out.println("CPF: " + this.cpf);
		System.out.println("E-mail: " + this.email);
		System.out.println("Telefone: " + this.telefone);
	}

	
	
}
