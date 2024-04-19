import java.util.Scanner;



public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Dado dado = new Dado();
        Dado dado2 = new Dado();
        System.out.println("Adivinhe qual o valor dos dois dados somados: ");
        int palpite = scanner.nextInt();
        int soma = dado.lancar() + dado2.lancar();
        if (palpite == soma) {
            System.out.println("Parabéns, você acertou!");
        } else {
            System.out.println("Que pena, você errou! O valor correto era: " + soma);
            
        }
        System.out.println("Gostaria de tentar novamente? (s/n)");
        String resposta = scanner.next();
        while (resposta.equals("s")) {
            System.out.println("Adivinhe qual o valor dos dois dados somados: ");
            palpite = scanner.nextInt();
            soma = dado.lancar() + dado2.lancar();
            if (palpite == soma) {
                System.out.println("Parabéns, você acertou!");
            } else {
                System.out.println("Que pena, você errou! O valor correto era: " + soma);
            }
            System.out.println("Gostaria de tentar novamente? (s/n)");
            resposta = scanner.next();
        }
        

    }
}
