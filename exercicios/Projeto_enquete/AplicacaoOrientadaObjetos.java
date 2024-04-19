import java.util.Scanner;

public class AplicacaoOrientadaObjetos {
    
    public static void main(String args[]){

        Pergunta um = new Pergunta(1, "Qual o seu nome?", "pessoal");
        Pergunta dois = new Pergunta(2, "Defina classe e objeto?", "OO");
        Pergunta tres = new Pergunta(3, "Para que serve o construtor?", "OO");
        Pergunta quatro = new Pergunta(4, "Maior dificuldade?", "pessoal");

        Scanner tec = new Scanner(System.in);

        System.out.println(um.getNumero() + um.getQuestao());
        String nome = tec.nextLine();

        Resposta resp1 = new Resposta(nome, nome , um.getNumero());

        System.out.println(dois.getNumero() + dois.getQuestao());
        String aux = tec.nextLine();

        Resposta resp2 = new Resposta(nome, aux, dois.getNumero());

        System.out.println(tres.getNumero() + tres.getQuestao());
        aux = tec.nextLine();

        Resposta resp3 = new Resposta(nome, aux, tres.getNumero());

    }
    

    
}
