package br.com.caelum.contas;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente titular, int agencia, int conta, Data dataAbertura, double saldo) {
		super(titular, agencia, conta, dataAbertura, saldo);
	}

	@Override
	public double rendimento() {
		return getSaldo() * 0.15;
	}

	@Override
	public void mostraRendimento() {
		System.out.printf("Seu rendimento esse mês foi de: %.2f%n", rendimento());
	}
}
