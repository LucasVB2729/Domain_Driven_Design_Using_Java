package br.com.fiap.app;

import br.com.fiap.modelo.Partida;
import br.com.fiap.modelo.Time;

public class Quadrangular {

    public static void main(String[] args) {
        Time real = new Time("Real Madrid");
        Time arsenal = new Time("Arsenal");
        Time city = new Time("Manchester City");
        Time bayern = new Time("Bayern de Munique");

        Partida p1 = new Partida(real, city, "bernabeu", 1, 1);
        Partida p2 = new Partida(bayern, arsenal, "Munich", 1, 0);
        Partida p3 = new Partida(real, bayern, "Emirates", 3, 0);
        Partida p4 = new Partida(real, arsenal, "Emirates", 2, 1);
        Partida p5 = new Partida(bayern, city, "Etihad", 2, 3);
        Partida p6 = new Partida(city, arsenal, "Emirates", 3, 1);

        System.out.println("Tabela do Quadrangular");
        System.out.println("Time\t\tPontos\tSaldo de Gols");
        System.out.println(real);
        System.out.println(arsenal);
        System.out.println(city);
        System.out.println(bayern);
        // System.out.println(real.getNome() + "\t" + real.getPontos() + "\t" +
        // real.getSaldoGols());
        // System.out.println(arsenal.getNome() + "\t\t" + arsenal.getPontos() + "\t" +
        // arsenal.getSaldoGols());
        // System.out.println(city.getNome() + "\t" + city.getPontos() + "\t" +
        // city.getSaldoGols());
        // System.out.println(bayern.getNome() + "\t" + bayern.getPontos() + "\t" +
        // bayern.getSaldoGols());

    }

}
