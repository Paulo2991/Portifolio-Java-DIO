package bancodigitaloo;

public class BancoDigitalOO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente cliente = new Cliente();
		cliente.setNome("Paulo Henrique Vaz Barbosa");
		ContaCorrente contaCorrente = new ContaCorrente(cliente);
		contaCorrente.depositar(100);
		contaCorrente.imprimirConta();
		ContaPoupanca contaPoupanca = new ContaPoupanca(cliente);
		contaPoupanca.transferir(100, contaPoupanca);
		contaPoupanca.imprimirConta();
	}

}
