package br.com.caelum.contas.main;

import br.com.caelum.contas.Banco;
import br.com.caelum.contas.Cliente;
import br.com.caelum.contas.ContaCorrente;
import br.com.caelum.contas.ContaPoupanca;
import br.com.caelum.contas.Data;

public class Principal {
	public static void main(String[] args) {

		Cliente cli1 = new Cliente("Igor", "34555677860", 12345);
		Cliente cli2 = new Cliente("Raphael", "12345678900", 12344);

		Data d1 = new Data(20, 12, 2000);
		Data d2 = new Data(14, 01, 2010);

		ContaPoupanca c1 = new ContaPoupanca(cli1, 1234, 88756, d1, 14000.51);
		ContaCorrente c2 = new ContaCorrente(cli2, 1234, 88756, d2, 14000.51);

		c1.depositar(1000);
		c2.depositar(145);

		c1.totalContasAbertas();

		c1.recuperaDadosParaImpressao();
		c2.recuperaDadosParaImpressao();

		c1.mostraRendimento();

		Banco meuBanco = new Banco();
		meuBanco.nome = "nuBank";

		System.out.println(meuBanco.nome);

	}

}
