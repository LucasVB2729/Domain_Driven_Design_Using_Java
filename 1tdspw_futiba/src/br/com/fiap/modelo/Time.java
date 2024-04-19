package br.com.fiap.modelo;

public class Time {

	private String nome;

	private int pontos;

	private int partidasJogadas;

	private int vitorias;

	private int empates;

	private int golsMarcados;

	private int golsSofridos;

	// Jeito fácil para criar os métodos e o(s) construtor(es)
	public Time(String nome) {
		super();
		this.nome = nome;
	}

	// INICIO DOS METODOS IMPLEMENTADOS
	public int getSaldoGols() {
		return golsMarcados - golsSofridos;
	}

	public int getDerrotas() {
		return partidasJogadas - vitorias - empates;
	}

	public void addVitoria() {
		this.pontos = this.pontos + 3;
		vitorias++;
	}

	public void addEmpate() {
		this.pontos++;
		empates++;
	}

	public void addPartidasJogadas() {
		this.partidasJogadas++;
	}
	// FIM DOS METODOS IMPLEMENTADOS

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPontos() {
		return pontos;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}

	public int getPartidasJogadas() {
		return partidasJogadas;
	}

	public void setPartidasJogadas(int partidasJogadas) {
		this.partidasJogadas = partidasJogadas;
	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}

	public int getGolsMarcados() {
		return golsMarcados;
	}

	public void setGolsMarcados(int golsMarcados) {
		this.golsMarcados = golsMarcados;
	}

	public int getGolsSofridos() {
		return golsSofridos;
	}

	public void setGolsSofridos(int golsSofridos) {
		this.golsSofridos = golsSofridos;
	}

	public void addGolsMarcados(int golsCasa) {

		this.golsMarcados = this.golsMarcados + golsCasa;
	}

	public void addGolsSofridos(int golsVisitante) {

		this.golsSofridos = this.golsSofridos + golsVisitante;
	}

	public String toString() {
		return nome + "\t" + pontos + "\t" + getSaldoGols() + "\t" + vitorias;
	}

}
