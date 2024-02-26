package br.com.caelum.contas;

public class Data {
	private int mes;
	private int dia;
	private int ano;

	// ----------------------- methods -----------------------------
	public void fomataData() {
		System.out.printf("Data de abertura: %d/%d/%d %n", dia, mes, ano);
	}

	public Data(int mes, int dia, int ano) {
		super();
		this.mes = mes;
		this.dia = dia;
		this.ano = ano;
	}

	// ----------------------- getter and setters ------------------
	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
}
