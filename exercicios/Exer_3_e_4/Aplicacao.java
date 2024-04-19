package exercicios.Exer_3_e_4;

import java.util.Scanner;

public class Aplicacao {

    public static void main(String[] args) {

    Data um = new Data (0,0,0);

     Scanner tec = new Scanner(System.in);   
     System.out.println("Digite o dia: ");
     String dia = tec.nextLine();
     int diai = Integer.parseInt(dia);
     um.setDia(diai);
     checarDia(um);
     System.out.println("Digite o mes: ");
     String mes = tec.nextLine();
     int mesi = Integer.parseInt(mes);
     um.setMes(mesi);
     checarMes(um);
     System.out.println("Digite o ano (yyyy) : ");
     String ano = tec.nextLine();
     int anoi = Integer.parseInt(ano);
     um.setAno(anoi);
     checarAno(um);
     
     //Data um = new Data (diai, mesi,anoi);

    
     //else
    toString(um);
    System.out.println(toString(um));
    }


public static void checarDia(Data um){
    if (um.getDia() > 31 || um.getDia()<=0){
        System.out.println("Dia foi digitado errado.");
        System.exit(0);
       
    }
    }
public static void checarMes(Data um){
    if (um.getMes() > 12 || um.getMes()<=0){
        System.out.println("Mes foi digitado errado.");
        System.exit(0);
        }
}
public static void checarAno(Data um){
    if (um.getAno() > 2006 || um.getAno()<1900){
        System.out.println("Ano foi digitado errado ou vc é menor de 18 anos.");
        System.exit(0);
        }
    }

    public static String toString(Data um){
        return um.getDia() +"/"+ um.getMes() +"/"+ um.getAno();
    }
}