//import Exe_aula2.Documento;


public class AplicacaoDocumento{
    public static void main(String[] args) {
        Documento documento = new Documento();
        documento.adiciona("Ola, tudo bem");
        documento.novaLinha();
        documento.adiciona("Estou bem e voce?");
        documento.novaLinha();
        documento.adiciona("Estou bem tambem");
        documento.novaLinha();
        documento.adiciona("Que bom");
        System.out.println(documento.getTexte());
        
    }
}