package agendatelefonica;
import java.util.Scanner;


public class AgendaTelefonica {


    public static void main(String[] args) {
String matriz [] = new String [20];
        
        Scanner ent = new Scanner(System.in);
        
            for (int j = 0; j < 20; j++ ){
                
                if
                (j % 2 != 0){
                 System.out.println("Entre o telefone dessa pessoa: ");
                 matriz[j]=ent.next();
                
                } else {
                System.out.println("Entre um nome: ");
                matriz[j]=ent.next();
    }
            }
                
            for (int j = 0; j < 20; j++){
               if
               (j % 2 != 0){        
                System.out.print(matriz[j]);
               } else {
                System.out.print("\n" + matriz[j] + " - ");   
               }
            }
            System.out.print("\n");
        }
    }
    

