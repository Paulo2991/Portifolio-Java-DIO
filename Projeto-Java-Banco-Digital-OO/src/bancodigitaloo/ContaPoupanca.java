package bancodigitaloo;

public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimirConta() {
		System.out.println("Conta:");
		super.imprimirConta();
	}
}
