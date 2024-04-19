package exercicios.exe_aula;
import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Entre o primeiro numero: ");
        int num1 = scanner.nextInt();
        
        
        System.out.print("Entre o segundo numero: ");
        int num2 = scanner.nextInt();
        
        
        Calculadora calculadora = new Calculadora(num1, num2);

        System.out.print("Entre o primeiro numero: ");
        num1 = scanner.nextInt();
        
        
        System.out.print("Entre o segundo numero: ");
        num2 = scanner.nextInt();

        Calculadora calculadora2 = new Calculadora(num1, num2);

        System.out.print("Entre o primeiro numero: ");
        num1 = scanner.nextInt();
        
        
        System.out.print("Entre o segundo numero: ");
        num2 = scanner.nextInt();

        Calculadora calculadora3 = new Calculadora(num1, num2);
        
        System.out.println("Soma (" + calculadora.getNum1() + " + " + calculadora.getNum2() + "): " + calculadora.soma());
        System.out.println("Subtracao (" + calculadora.getNum1() + " - " + calculadora.getNum2() + "): " + calculadora.subtracao());
        System.out.println("Multiplicacao (" + calculadora.getNum1() + " * " + calculadora.getNum2() + "): " + calculadora.multiplicacao());
        System.out.println("Divisao (" + calculadora.getNum1() + " / " + calculadora.getNum2() + "): " + calculadora.divisao());
        System.out.println("Potencia (" + calculadora.getNum1() + " ^ " + calculadora.getNum2() + "): " + calculadora.potencia());
        System.out.println("Raiz Primeiro Numero (" + calculadora.getNum1() + "): " + calculadora.raiz());
        System.out.println("Raiz Segundo Numero (" + calculadora.getNum2() + "): " + calculadora.raiz2());

        System.out.println("Soma (" + calculadora2.getNum1() + " + " + calculadora2.getNum2() + "): " + calculadora2.soma());
        System.out.println("Subtracao (" + calculadora2.getNum1() + " - " + calculadora2.getNum2() + "): " + calculadora2.subtracao());
        System.out.println("Multiplicacao (" + calculadora2.getNum1() + " * " + calculadora2.getNum2() + "): " + calculadora2.multiplicacao());
        System.out.println("Divisao (" + calculadora2.getNum1() + " / " + calculadora2.getNum2() + "): " + calculadora2.divisao());
        System.out.println("Potencia (" + calculadora2.getNum1() + " ^ " + calculadora2.getNum2() + "): " + calculadora2.potencia());
        System.out.println("Raiz Primeiro Numero (" + calculadora2.getNum1() + "): " + calculadora2.raiz2());
        System.out.println("Raiz Segundo Numero (" + calculadora2.getNum2() + "): " + calculadora2.raiz());

        System.out.println("Soma (" + calculadora3.getNum1() + " + " + calculadora3.getNum2() + "): " + calculadora3.soma());
        System.out.println("Subtracao (" + calculadora3.getNum1() + " - " + calculadora3.getNum2() + "): " + calculadora3.subtracao());
        System.out.println("Multiplicacao (" + calculadora3.getNum1() + " * " + calculadora3.getNum2() + "): " + calculadora3.multiplicacao());
        System.out.println("Divisao (" + calculadora3.getNum1() + " / " + calculadora3.getNum2() + "): " + calculadora3.divisao());
        System.out.println("Potencia (" + calculadora3.getNum1() + " ^ " + calculadora3.getNum2() + "): " + calculadora3.potencia());
        System.out.println("Raiz Primeiro Numero (" + calculadora3.getNum1() + "): " + calculadora3.raiz2());
        System.out.println("Raiz Segundo Numero (" + calculadora3.getNum2() + "): " + calculadora3.raiz());
}




}
