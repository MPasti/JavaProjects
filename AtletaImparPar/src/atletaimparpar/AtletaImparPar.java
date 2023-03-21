package atletaimparpar;
import java.util.Scanner;
/**
 *
 * @author Windows 10
 */
public class AtletaImparPar {

public static void main(String[] args){ 
                
 int i;
 
     Scanner teclado = new Scanner(System.in);
     int []vlido= new int [6];
     int []vpar = new int [6];
     int []vimpar = new int [6]; 
     
for(i=1; i<=5;i++){
   System.out.print("Entre a pontuação do " +i+ "° atleta: ");
int n = teclado.nextInt();
vlido[i]=n;
 if (vlido[i] % 2 ==0 ) {
             vpar[i]= vlido [i];
         }
         else {
             vimpar[i]= vlido [i]; 
         }

          }
     System.out.print("\nOs números pares são: ");
     for (i=0; i<vpar.length; i++) {
         System.out.print(vpar[i] + " ");
     }
     System.out.print("\nOs números impares são: ");
     for (i=0; i<vimpar.length; i++){
         System.out.print(vimpar[i] + " ");
        } 
}
}