package java_poo_cliente;

public class TestaCliente {

	public static void main(String[] args) {
	
		Cliente cliente1 = new Cliente(1, "Celina", "Tartaruga", "77-77-7777", "celina@hotmail.com", "73 9 9999-9999");
		Cliente cliente2 = new Cliente(2, "Brenda", "Borboleta", "11-11-1111", "brenda@hotmail.com", "73 9 8888-8888");
		
		cliente1.visualizar();
		cliente2.visualizar();
				
		PessoaFisica pessoaFisica1 = new PessoaFisica(3, "João", "Tigre", "33-33-3333", "joao@hotmail.com", "73 9 7777-7777", "222.222.222-22");
		PessoaFisica pessoaFisica2 = new PessoaFisica(4, "Joaquim", "Lobo", "44-44-4444", "joaquim@hotmail.com", "73 9 6666-6666", "333.333.333-33");
		
		pessoaFisica1.visualizar();
		pessoaFisica2.visualizar();
		
		PessoaJuridica pessoaJuridica1 = new PessoaJuridica(1, "Imports FA", "LTDA", "22-22-2222", "fa@hotmail.com", "73 9 0000-0000", "11.111.111/0001-11");
	    PessoaJuridica pessoaJuridica2 = new PessoaJuridica(2, "Imports AJ", "LTDA", "55-55-5555", "aj@hotmail.com", "73 9 5555-5555", "22.222.222/0002-22");
	    
	    pessoaJuridica1.visualizar();
	    pessoaJuridica2.visualizar();
	}

}
