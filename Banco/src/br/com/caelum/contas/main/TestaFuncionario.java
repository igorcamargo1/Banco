package br.com.caelum.contas.main;

import br.com.caelum.contas.Cliente;
import br.com.caelum.funcionarios.Autenticavel;
import br.com.caelum.funcionarios.ControleDeBonificacoes;
import br.com.caelum.funcionarios.Gerente;
import br.com.caelum.funcionarios.Presidente;
import br.com.caelum.funcionarios.SistemaInterno;

public class TestaFuncionario {

	public static void main(String[] args) {

		Gerente g1 = new Gerente("Igor", "48655744476", 2300, 12344);
		Presidente g2 = new Presidente("Raphael", "32452452522", 1500);
		Autenticavel c1 = new Cliente("Igor", "34555677860", 12344);

		ControleDeBonificacoes cdb = new ControleDeBonificacoes();

		cdb.registra(g1);
		cdb.registra(g2);
		double total = cdb.getTotalDeBonificacoes();

		System.out.println(total);

		SistemaInterno sistema = new SistemaInterno();

		sistema.login(c1);

	}

}
