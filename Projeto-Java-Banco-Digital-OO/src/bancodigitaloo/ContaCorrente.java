package bancodigitaloo;

public class ContaCorrente extends Conta {
	
	public ContaCorrente(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimirConta() {
		System.out.println("Conta:");
		super.imprimirConta();
	}
}
