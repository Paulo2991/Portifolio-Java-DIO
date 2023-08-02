package bancodigitaloo;

import bancodigitaloo.intefaces.ContaInterface;

public class Conta implements ContaInterface {
	private static final int AGENCIAPADRAO = 0001;
	private int agencia;
	private int numero;
	private double saldo;
	
	private static int SEQUENCIAL = 0;

	public Conta() {
		this.agencia = Conta.AGENCIAPADRAO;
		this.numero = SEQUENCIAL++;
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
		
	}
	
	@Override
	public void depositar(double valor) {
		
	}
	
	@Override
	public void transferir(double valor,Conta contaDestino) {
		
	}
}
