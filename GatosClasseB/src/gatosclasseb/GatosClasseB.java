    
package gatosclasseb;

import java.util.Scanner;

public class GatosClasseB {


    public static void main(String[] args) {
    
        int op;
            
        Scanner ent = new Scanner (System.in);

        Gatos miau1 = new Gatos ();
        System.out.println("Entre o nome do 1° Gato");
        miau1.Nome = ent.nextLine();
        System.out.println("Entre a cor do 1° Gato");
        miau1.Cor = ent.nextLine ();
        miau1.dormir();
        miau1.status();
        miau1.miar();
        
        Gatos miau2 = new Gatos ();
        System.out.println("Entre o nome do 2° Gato");
        miau2.Nome = ent.nextLine();
        System.out.println("Entre a cor do 2° Gato");
        miau2.Cor = ent.nextLine();
        miau2.acordar();
        miau2.status();
        miau2.miar();
        
        Gatos miau3 = new Gatos ();
        System.out.println("Entre o nome do 3° Gato");            
        miau3.Nome = ent.nextLine();
        System.out.println("Entre a cor do 3° Gato");        
        miau3.Cor = ent.nextLine();
        miau3.dormir();
        miau3.status();
        miau3.miar();
        
        
    System.out.println("Entre com 1,2 ou 3 para imprimir tal gato");
op = ent.nextInt();
        switch (op) {
            case 1:
                System.out.println("Primeiro gato = " + miau1.Nome + " " + miau1.Cor );
                break;
            case 2:
                System.out.println("Segundo gato = " + miau2.Nome + " " + miau2.Cor );
               break;
            case 3:
               System.out.println("Terceiro gato = " + miau3.Nome + " " + miau3.Cor );
               break;                
            default:
                System.out.println("Esse objeto não existe");
               break;
    
    }
  }   
}
