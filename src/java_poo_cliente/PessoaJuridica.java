package java_poo_cliente;

public class PessoaJuridica extends Cliente{

	private String cnpj;

	public PessoaJuridica(int id, String nome, String sobrenome, String dataNascimento, String email, String telefone, String cnpj) {
		super(id, nome, sobrenome, dataNascimento, email, telefone);
		
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("CNPJ: " + this.cnpj);
	}
	
}
