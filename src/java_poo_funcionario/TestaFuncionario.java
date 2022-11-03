package java_poo_funcionario;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		Funcionario funcionario1 = new Funcionario(1, "Everaldo Tatu", "17-10-1970", "everaldo@hotmail.com", "73 9 1111-1111", "Caminhoneiro", "Logística", 4500.0f, "20-01-2015");
		Funcionario funcionario2 = new Funcionario(1, "Maria Peixe", "29-07-2009", "maria@hotmail.com", "73 9 1111-2222", "Designer Júnior", "Design", 2500.0f, "20-05-2020");

		funcionario1.visualizar();
		funcionario2.visualizar();
	}

}
