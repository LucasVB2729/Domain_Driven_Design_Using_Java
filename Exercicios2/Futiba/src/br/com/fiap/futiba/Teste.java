
package br.com.fiap.futiba;
//package ;

import java.time.LocalDate;

// import br.com.fiap.futiba.Jogador; // Remove the unused import statement

public class Teste {

    public static void main(String[] args) {

        Jogador j = new Jogador();
        j.setNome("Ronaldo");
        j.dataNascimento = LocalDate.of(1976, 9, 22);

        Jogador k = new Jogador();
        k.setNome("Rogério Ceni");
        k.dataNascimento = LocalDate.of(1973, 1, 1);

        Jogador l = new Jogador();
        l.setNome("Neymar");
        l.dataNascimento = LocalDate.of(1992, 2, 5);

        System.out.println(l.getIdade());

    }

}
