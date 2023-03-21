
package exemploclasseb;

import java.util.Scanner;

public class ExemploClasseB {



    public static void main(String[] args) {
        
            int op;
            
        Scanner ent = new Scanner (System.in);

        Cachorro cao1 = new Cachorro ();
        System.out.println("Entre o nome do 1° Cachorro");
        cao1.Nome = ent.nextLine();
        System.out.println("Entre a cor do 1° Cachorro");
        cao1.Cor = ent.nextLine ();
        cao1.dormir();
        cao1.status();
        cao1.latir();
        
        Cachorro cao2 = new Cachorro ();
        System.out.println("Entre o nome do 2° Cachorro");
        cao2.Nome = ent.nextLine();
        System.out.println("Entre a cor do 2° Cachorro");
        cao2.Cor = ent.nextLine();
        cao2.acordar();
        cao2.status();
        cao2.latir();
        
        Cachorro cao3 = new Cachorro ();
        System.out.println("Entre o nome do 3° Cachorro");            
        cao3.Nome = ent.nextLine();
        System.out.println("Entre a cor do 3° Cachorro");        
        cao3.Cor = ent.nextLine();
        cao3.dormir();
        cao3.status();
        cao3.latir();
        
        
        System.out.println("Primeiro cachorro: " + cao1.Nome + " - Cor: " + cao1.Cor);
        System.out.println("Segundo cachorro: " + cao2.Nome + " - Cor: " + cao2.Cor);
        System.out.println("Terceiro cachorro: " + cao3.Nome + " - Cor: " + cao3.Cor);
        
    
//System.out.println("Entre com 1,2 ou 3 para imprimir tal cachorro");
//op = ent.nextInt();
  //      switch (op) {
    //        case 1:
      //          System.out.println("Objeto 1 = " + cao1.Nome + " " + cao1.Cor );
        //        break;
          //  case 2:
            //    System.out.println("Objeto 2 = " + cao2.Nome + " " + cao2.Cor );
              //  break;
            //case 3:
              //  System.out.println("Objeto 3 = " + cao3.Nome + " " + cao3.Cor );
               // break;                
           // default:
             //   System.out.println("Esse objeto não existe");
              //  break;
//        }
 //   } 
 
    
     }
}
    
