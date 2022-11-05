package java_poo_funcionario;

import java_poo_cliente.PessoaFisica;
import java_poo_cliente.PessoaJuridica;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		Funcionario funcionario1 = new Funcionario(1, "Everaldo Tatu", "17-10-1970", "everaldo@hotmail.com", "73 9 1111-1111", 4500.0f);
		Funcionario funcionario2 = new Funcionario(2, "Maria Peixe", "29-07-2009", "maria@hotmail.com", "73 9 1111-2222", 2500.0f);

		funcionario1.visualizar();
		funcionario2.visualizar();
		
		Gerente g1 = new Gerente(3, "Neto Elefante", "66-66-6666", "neto@hotmail.com", "73 9 4444-4444", 5000.0f, 5);
		Gerente g2 = new Gerente(4, "Carol Abelha", "77-77-7777", "carol@hotmail.com", "73 9 3333-3333", 5000.0f, 5);
		
		g1.visualizar();
		g2.visualizar();
		
		Vendedor v1 = new Vendedor(5, "Kal Girafa", "99-99-9999", "kal@hotmail.com", "73 9 1111-111", 3000.0f, "Tecnologia");
	    Vendedor v2 = new Vendedor(6, "Moises Suricato", "88-88-8888", "moises@hotmail.com", "73 9 0000-0000", 3000.0f, "Eletrodomésticos");
	    
	    v1.visualizar();
	    v2.visualizar();
	}

}
