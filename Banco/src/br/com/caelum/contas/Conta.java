package br.com.caelum.contas;

public abstract class Conta {

	private Cliente titular;
	private int agencia;
	private int conta;
	public Data dataAbertura;
	private double saldo;
	private static int totalContas;

	// ------------------- methods --------------------------------

	public void sacar(double quantidade) {
		if (quantidade <= 0) {
			System.out.println("Não é possível sacar esse valor");
		} else {
			if (this.saldo < quantidade) {
				System.out.println("Saldo menor que a quantidade desejada");
			} else {
				this.saldo -= quantidade;
				System.out.println("saque realizado");
			}
		}
	}

	public void depositar(double quantidade) {
		if (quantidade <= 0) {
			System.out.println("Não é possível depositar esse valor");
		} else {
			this.saldo += quantidade;
			System.out.println("deposito realizado");
		}
	}

	public void transferir(Conta destino, double valor) {
		if (valor <= 0) {
			System.out.println("Não é possível tranferir esse valor");
		} else {
			if (this.saldo < valor) {
				System.out.println("Saldo insuficiente!");
			} else {
				sacar(valor);
				destino.depositar(valor);
				System.out.println("transferência realizada com suscesso!");
			}
		}
	}

	public abstract double rendimento();

	public abstract void mostraRendimento();

	public void totalContasAbertas() {
		System.out.println("O total de contas abertas é de: " + Conta.getTotalContas());
	}

	public void recuperaDadosParaImpressao() {
		System.out.println("======================");
		System.out.println("Titular da conta: " + titular.getNome());
		System.out.println("Agência: " + this.agencia);
		System.out.println("Conta: " + this.conta);
		System.out.println("Saldo: " + this.saldo);
		System.out.printf("Rendimento: %.2f%n", this.saldo * 0.1);
		dataAbertura.fomataData();
		System.out.println("======================");
		System.out.println();
	}

	// ------------------ constructor ---------------------

	public Conta(Cliente titular, int agencia, int conta, Data dataAbertura, double saldo) {
		super();
		this.titular = titular;
		this.agencia = agencia;
		this.conta = conta;
		this.dataAbertura = dataAbertura;
		this.saldo = saldo;
		Conta.totalContas = Conta.totalContas + 1;
	}

	public Conta(int agencia, int conta, Data dataAbertura, double saldo) {
		super();
		this.agencia = agencia;
		this.conta = conta;
		this.dataAbertura = dataAbertura;
		this.saldo = saldo;
		Conta.totalContas = Conta.totalContas + 1;
	}

	// ------------------ getter and setters ---------------------

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Data getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(Data dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public double getSaldo() {
		return saldo;
	}

	public static int getTotalContas() {
		return totalContas;
	}

	public static void setTotalContas(int totalContas) {
		Conta.totalContas = totalContas;
	}

}
