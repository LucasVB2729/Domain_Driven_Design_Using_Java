package exercicios.Exe_Conta_Mercado;

public class Conta {

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }
    public String getItens() {
        return itens;
    }
    public void setItens(String itens) {
        this.itens = itens;
    }
    private String cpf;
    private double total;
    private String itens;
    public Conta(String cpf, double total, String itens) {
        this.cpf = cpf;
        this.total = total;
        this.itens = itens;
    }
    

    public void adicionarCompra(int qtd, double valor, String nome){
        this.total = this.total + (qtd * valor);
        this.itens = this.itens + nome + " - " + qtd + " - " + valor + "\n";
    }
}
