package java_poo_cliente;

public class PessoaFisica extends Cliente{
	
	private String cpf;

	public PessoaFisica(int id, String nome, String sobrenome, String dataNascimento, String email, String telefone, String cpf) {
		super(id, nome, sobrenome, dataNascimento, email, telefone);
		
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("CPF: " + this.cpf);
	}
}
