package br.com.caelum.contas.main;

import br.com.caelum.funcionarios.ControleDeBonificacoes;
import br.com.caelum.funcionarios.Gerente;
import br.com.caelum.funcionarios.Presidente;

public class TestaFuncionario {

	public static void main(String[] args) {

		Gerente g1 = new Gerente("Igor", "48655744476", 2300, 12345);
		Presidente g2 = new Presidente("Raphael", "32452452522", 1500);

		g1.autenticaSenha(12345);

		ControleDeBonificacoes cdb = new ControleDeBonificacoes();

		cdb.registra(g1);
		cdb.registra(g2);
		double total = cdb.getTotalDeBonificacoes();

		System.out.println(total);

	}

}
