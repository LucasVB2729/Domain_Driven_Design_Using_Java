public class Resposta {

    private String pessoa;
    private String texto;
    private int pergunta; //numero da pergunta
    
    
    public Resposta(String pessoa, String texto, int pergunta) {
        this.pessoa = pessoa;
        this.texto = texto;
        this.pergunta = pergunta;
    }
    public String getPessoa() {
        return pessoa;
    }
    public void setPessoa(String pessoa) {
        this.pessoa = pessoa;
    }
    public String getTexto() {
        return texto;
    }
    public void setTexto(String texto) {
        this.texto = texto;
    }
    public int getPergunta() {
        return pergunta;
    }
    public void setPergunta(int pergunta) {
        this.pergunta = pergunta;
    }





}
