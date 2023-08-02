package bancodigitaloo;

import bancodigitaloo.intefaces.ContaInterface;

public class Conta implements ContaInterface {
	private static final int AGENCIAPADRAO = 0001;
	private int agencia;
	private int numero;
	private double saldo;
	private Cliente cliente;
	
	private static int SEQUENCIAL = 0;

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIAPADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}
	
	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public void sacar(double valor) {
		this.saldo -= valor;
	}
	
	@Override
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	@Override
	public void transferir(double valor,Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	@Override
	public void imprimirConta() {
		// TODO Auto-generated method stub
		System.out.println("*** Extrato Conta Corrente **** ");
		System.out.println(String.format("Cliente: " + this.cliente.getNome()));
		System.out.println(String.format("Agencia: " + this.getAgencia()));
		System.out.println(String.format("Conta: " + this.getNumero()));
		System.out.println(String.format("Saldo: " + this.getSaldo()));
	}

}
