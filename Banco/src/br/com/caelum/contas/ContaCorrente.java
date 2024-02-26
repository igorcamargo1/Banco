package br.com.caelum.contas;

public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente titular, int agencia, int conta, Data dataAbertura, double saldo) {
		super(titular, agencia, conta, dataAbertura, saldo);
	}

	@Override
	public double rendimento() {
		// TODO Auto-generated method stub
		return getSaldo() * 0.10;
	}

	@Override
	public void mostraRendimento() {
		System.out.printf("Seu rendimento esse mês foi de: %.2f%n", rendimento());
	}

}
