
package exercicios.exe_aula;

public class Calculadora {
    private double num1;
    private double num2;
    private double resultado;

    public Calculadora(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }


    public double soma() {
        return num1 + num2;
    }

    public double subtracao() {
        return num1 - num2;
    }

    public double multiplicacao() {
        return num1 * num2;

    }

    public double divisao() {
        return num1 / num2;
    }

    public double potencia() {
        return Math.pow(num1, num2);
    }

    public double raiz() {
        return Math.sqrt(num1);
    }

    public double raiz2() {
        return Math.sqrt(num2);
    }
}
