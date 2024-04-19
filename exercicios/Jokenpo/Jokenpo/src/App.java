public class App {
     
     public static void main(String[] args)  {

            Jogo jogo = new Jogo();
            int chute;
            int tentativas = 0;
    
            while (tentativas < 10) {
                chute = Integer.parseInt(System.console().readLine("Digite um número: "));
                jogo.setNumeroChutado(chute);
                jogo.setTentativas(++tentativas);
                jogo.adivinhar();
                if (jogo.getNumeroChutado() == jogo.getNumeroSorteado()) {
                    break;
                }
            }
         
         




    }
}
