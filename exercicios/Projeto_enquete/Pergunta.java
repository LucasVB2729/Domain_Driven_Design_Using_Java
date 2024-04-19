public class Pergunta {

    private int numero;
    private String questao;
    private String tema;

    public Pergunta(int numero, String questao, String tema) {
        this.numero = numero;
        this.questao = questao;
        this.tema = tema;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getQuestao() {
        return questao;
    }
    public void setQuestao(String questao) {
        this.questao = questao;
    }
    public String getTema() {
        return tema;
    }
    public void setTema(String tema) {
        this.tema = tema;
    }
    
}
