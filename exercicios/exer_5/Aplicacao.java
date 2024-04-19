package exercicios.exer_5;

public class Aplicacao {
    
    Dado dado = new Dado(6);

    public static void main(String[] args) {
    Dado dado = new Dado(6);
for (int i = 0; i < 10; i++) {
    dado.rolar();
    System.out.println("Valor sorteado: " + dado.getValorAtual());
}
    }
}
