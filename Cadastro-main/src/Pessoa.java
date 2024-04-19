public class Pessoa {

    private String nome;
    private int idade;
    private Endereco residencial;
    private Endereco comercial;

    public Pessoa(String nome, int idade, Endereco residencial, Endereco comercial) {
        this.nome = nome;
        this.idade = idade;
        this.residencial = residencial;
        this.comercial = comercial;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Endereco getResidencial() {
        return residencial;
    }

    public void setResidencial(Endereco residencial) {
        this.residencial = residencial;
    }

    public Endereco getComercial() {
        return comercial;
    }

    public void setComercial(Endereco comercial) {
        this.comercial = comercial;
    }

    public String toString() {
        return nome + residencial + comercial;

    }

}
