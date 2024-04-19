package br.com.fiap.futiba;

import java.time.LocalDate;

public class Jogador {

    private String nome;
    private String posicao;
    public LocalDate dataNascimento;

    public String getnome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return LocalDate.now().getYear() - dataNascimento.getYear();
    }
}
