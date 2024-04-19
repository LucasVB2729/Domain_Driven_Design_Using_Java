public class Jogo {


    private int numeroSorteado;
    private int numeroChutado;
    private int tentativas;

    public Jogo() {
        this.numeroSorteado = (int) (Math.random() * 1000);
        this.numeroChutado = 0;
        this.tentativas = 0;
    }

    public void setNumeroChutado(int numeroChutado) {
        this.numeroChutado = numeroChutado;
    }

    public void setTentativas(int tentativas) {
        this.tentativas = tentativas;
    }

    public int getNumeroSorteado() {
        return numeroSorteado;
    }

    public int getNumeroChutado() {
        return numeroChutado;
    }

    public int getTentativas() {
        return tentativas;
    }

    public void adivinhar() {
        if (numeroChutado == numeroSorteado) {
            System.out.println("Parabéns! Você acertou o número " + numeroSorteado + " em " + tentativas + " tentativas.");
        } else if (numeroChutado < numeroSorteado) {
            System.out.println("O número sorteado é maior que " + numeroChutado + ".");
        } else {
            System.out.println("O número sorteado é menor que " + numeroChutado + ".");
        }
    }
}

