package java_poo_cliente;

public class Cliente {

	private int id;
	private String nome;
	private String sobrenome;
	private String dataNascimento;
	private String email;
	private String telefone;
	
	public Cliente(int id, String nome, String sobrenome, String dataNascimento, String email, String telefone) {
		super();
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dataNascimento = dataNascimento;
		this.email = email;
		this.telefone = telefone;
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


	public String getSobrenome() {
		return sobrenome;
	}


	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
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


	public void visualizar() {
		System.out.println("\n=======================================\n");
		System.out.println("Dados do Cliente");
		System.out.println("\n=======================================");
		System.out.println("\nID: " + this.id);
		System.out.println("Nome: " + this.nome);
		System.out.println("Sobrenome: " + this.sobrenome);
		System.out.println("Idade: " + this.dataNascimento);
		System.out.println("E-mail: " + this.email);
		System.out.println("Telefone: " + this.telefone);
	}

	
	
}
