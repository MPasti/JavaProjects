package atividade2caneta;
import java.util.Scanner;


public class Caneta {
    Scanner ent = new Scanner (System.in);

    String Modelo;
    String Cor;
    int Carga;
    boolean tampado;
    
          String V;
          String zap;    
     void tampado(){
           this.tampado =true;
        }
     void destampado(){
           this.tampado =false;
        }
    
        void tampar (){
         System.out.println("Essa caneta está tampada?");
         System.out.println("Responda com sim ou não");
         V = ent.nextLine();
        if ("sim".equals(V)){
          System.out.print("A caneta está tampada!");
          this.tampado =true;  
        } 
       if ("não".equals(V)){
          System.out.print("A caneta não está tampada!");
          this.tampado =false; 
        }
            
        }
        void rabiscar(){   
         System.out.println("Você deseja rabiscar com essa caneta?");
         zap = ent.nextLine();
         if ("sim".equals(zap) && tampado == false){
           System.out.println("Você rabiscou! -10 de carga");
         this.Carga = this.Carga - 10;    
         }
         if ("não".equals(zap)){
           System.out.println("Você resolveu não rabiscar");
         }
         if ("sim".equals(zap) && tampado == true){
            System.out.println("Você não pode rabiscar! A caneta está fechada"); 
         }
                       }
         void status(){
            System.out.println("\n");
            System.out.println("Modelo: " + this.Modelo);
            System.out.println("Cor: " + this.Cor);
            System.out.println("Carga: " + this.Carga);
        }
    }
