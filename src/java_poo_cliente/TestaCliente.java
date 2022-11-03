package java_poo_cliente;

public class TestaCliente {

	public static void main(String[] args) {
	
		Cliente cliente1 = new Cliente(1, "Celina Tartaruga", 24, "123.456.789.00", "celina@hotmail.com", "73 9 9999-9999");
		
		cliente1.visualizar();
		
		Cliente cliente2 = new Cliente(2, "Brenda Borboleta", 25, "987.654.321.00", "brenda@hotmail.com", "73 9 8888-8888");
		
		cliente2.visualizar();

	}

}
