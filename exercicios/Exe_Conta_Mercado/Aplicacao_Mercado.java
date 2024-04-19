package exercicios.Exe_Conta_Mercado;

import java.util.Scanner;

public class Aplicacao_Mercado {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); 
    System.out.print("Entre o cpf: ");
    String cpf = scanner.nextLine();
    System.out.print("Entre o nome do item: ");
    String nome = scanner.nextLine();
    System.out.print("Entre a quantidade comprada: ");
    int qtd = scanner.nextInt();
    System.out.print("Entre o valor: ");
    double valor = scanner.nextDouble();

    Conta conta = new Conta(cpf, 0, "");
    conta.adicionarCompra(qtd, valor, nome);



    System.out.print("Entre o nome do item: ");
    nome = scanner.next() + scanner.nextLine();
    System.out.print("Entre a quantidade comprada: ");
    qtd = scanner.nextInt();
    System.out.print("Entre o valor: ");
    valor = scanner.nextDouble();
    conta.adicionarCompra(qtd, valor, nome);



    System.out.print("Entre o nome do item: ");
    nome = scanner.next() + scanner.nextLine();
    System.out.print("Entre a quantidade comprada: ");
    qtd = scanner.nextInt();
    System.out.print("Entre o valor: ");
    valor = scanner.nextDouble();
    conta.adicionarCompra(qtd, valor, nome);


    System.out.println("CPF: " + conta.getCpf());
    System.out.println("Itens: " + conta.getItens());
    System.out.println("Total: " + conta.getTotal());
    
    








    }

}
