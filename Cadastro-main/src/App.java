public class App {
    public static void main(String[] args) throws Exception {

        Endereco enderecoResidencial = new Endereco("Rua 1", "Bairro 1", "Cidade 1", "Estado 1");
        Endereco enderecoComercial = new Endereco("Rua 2", "Bairro 2", "Cidade 2", "Estado 2");

        Pessoa pessoa = new Pessoa("Fulano", 30, enderecoResidencial, enderecoComercial);

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println(pessoa);
        

    }
}
