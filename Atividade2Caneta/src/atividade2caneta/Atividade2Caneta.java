package atividade2caneta;

import java.util.Scanner;

public class Atividade2Caneta {

    public static void main(String[] args) {

              Scanner ent = new Scanner (System.in);     
              
             Caneta caneta1 = new Caneta ();
             System.out.println("Entre o modelo da caneta");
             caneta1.Modelo = ent.nextLine ();
             System.out.println("Entre a cor da caneta");
             caneta1.Cor = ent.nextLine();
             System.out.println("Entre a quantidade de carga");
             caneta1.Carga = ent.nextInt();
             caneta1.tampar();
             caneta1.rabiscar();
             caneta1.status();
            
        
    }
    
}
