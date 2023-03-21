
package banco;

    import java.util.Scanner;

public class Banco {

    public static void main(String[] args) {
     int x;
     
             Scanner ent = new Scanner (System.in);          
        
            
             Conta conta1 = new Conta ();
       do{   
             System.out.println("Entre o nome");
             conta1.nome = ent.nextLine ();
             System.out.println("Entre o número");
             conta1.numero = ent.nextLine();
             conta1.entrar();
             conta1.sacar();
             conta1.status();
             System.out.println("");
             conta1.depositar();
             System.out.println("");
             System.out.println("Deseja continuar?");
             System.out.println("1 para sim | 2 para não");
             x = ent.nextInt();
             
        }while (x<2);
             

    }
    
}
