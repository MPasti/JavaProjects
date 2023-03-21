package funçõesnãovoid;

import java.util.Scanner;

class Operações{
    public static int somar(int num1, int num2){
        return (num1 + num2);
    }
     public static int subtrair(int num1, int num2){
        return (num1 - num2);
    }
     public static int multiplicar(int num1, int num2){
        return (num1 * num2);
    }
     public static int dividir(int num1, int num2){
        return (num1 / num2);
    } 
}


public class FunçõesNãoVoid {
    
    public static void main(String[] args) {
    int n1, n2;
    int zap;
    Scanner ent = new Scanner (System.in);
    
    System.out.println("Entre o primeiro valor");
    n1 = ent.nextInt();
    System.out.println("Entre o segundo valor");
    n2 = ent.nextInt();
    
        System.out.println("Que tipo de operação você deseja fazer?");
          System.out.println("1-Soma | 2-Subtração | 3-Multiplicação | 4-Divisão");
      zap = ent.nextInt();
      {
      if (zap == 1){
        System.out.println("Soma = " + Operações.somar(n1, n2));
      }
      if (zap == 2){
        System.out.println("Subtração = " + Operações.subtrair(n1, n2));
      }
      if (zap == 3){
        System.out.println("Multiplicação = " + Operações.multiplicar(n1, n2));
      }
      if (zap == 4){
        System.out.println("Divisão = " + Operações.dividir(n1, n2)); 
      } 
      }    
    
    }
    
}
