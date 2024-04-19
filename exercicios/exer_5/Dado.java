package exercicios.exer_5;

public class Dado {

    private final int numeroDeFaces;
    private int[] faces;
    private int valorAtual;

    public Dado(int numeroDeFaces) {
        this.numeroDeFaces = numeroDeFaces;
        faces = new int[numeroDeFaces];
        for (int i = 0; i < numeroDeFaces; i++) {
            faces[i] = i + 1;
        }
        rolar();
    }

    public void rolar() {
        valorAtual = faces[(int) (Math.random() * numeroDeFaces)];
    }

    public int getValorAtual() {
        return valorAtual;
    }

    @Override
    public String toString() {
        return "Dado(valorAtual=" + valorAtual + ")";
    }
}

