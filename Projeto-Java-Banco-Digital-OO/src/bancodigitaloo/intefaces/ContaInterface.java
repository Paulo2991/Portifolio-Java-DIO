package bancodigitaloo.intefaces;

import bancodigitaloo.Conta;

public interface ContaInterface {
	void sacar(double valor);
	void depositar(double valor);
	void transferir(double valor, Conta contaDestino);
}
