
package banco;
import java.util.Random;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Conta {
    DecimalFormat formatador = new DecimalFormat("0.00");
        Scanner ent = new Scanner (System.in);
        Random random = new Random();
        
    String nome;
    String numero;
    double saldo = random.nextDouble()*700;
    double limite = 1000.00;
    boolean saque;
    String V;
    String N;
    
    void entrar(){
      
    System.out.println("Entrando na conta");
    System.out.println("1");
    System.out.println("2");    
    System.out.println("3");     
    System.out.println("Seu saldo é de: " + formatador.format(saldo));

 
    }
    
    void sacar(){
            Double zap;
            
         System.out.println("Você deseja sacar?");
         System.out.println("Responda com sim ou não");
         V = ent.next();
        if ("sim".equals(V)){
            this.saque = true;
          System.out.print("O saque será efetuado!");
          this.saque =true;  
          System.out.println("");
         System.out.println("Seu limite é de R$"+ limite);
         System.out.println("Quanto você deseja sacar?");
         zap = ent.nextDouble();
         
        if (zap > 1000.00){
              System.out.println("Infelizmente esse valor ultrapassa o limite");
              System.out.println("Saque um valor menor que R$" + limite);
               zap = ent.nextDouble();  
             this.saldo = saldo - zap;     
        }
        if (zap < 1000.00){
          this.saldo = saldo - zap;     
            System.out.println("Saque efetuado!");
     
        }
        } 
       if ("não".equals(V)){
          System.out.print("Certo");
          this.saque =false; 
        }
    }
    
    void status(){
            System.out.println("Nome: " + this.nome);
            System.out.println("Número: " + this.numero);
            System.out.println("Saldo da conta: " + formatador.format(this.saldo));
            System.out.println("Limite: " + limite);
    }
    
    void depositar(){
                 Double z;        
        System.out.println("Você deseja depositar? Responda com sim ou não");
         N = ent.next();
        if ("sim".equals(N)){
        System.out.println("O deposito será efetuado!");
        System.out.println("Quanto você deseja depositar?");
        z = ent.nextDouble();
        System.out.println("Deposito efetuado!");
        this.saldo = z + saldo;
        this.status();
        }
        if ("não".equals(N)){
          System.out.println("Ok");

        
         
        }
    }
    
       
}

