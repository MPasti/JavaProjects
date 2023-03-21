/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maratonaatletas;
    import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Windows 10
 */
public class MaratonaAtletas {
    
    public static void main(String[] args){
            
       Scanner ent = new Scanner(System.in);
       int[] n = new int[6];
       
           for (int i = 1; i < n.length; i++) 
           {
	           System.out.print("Digite o "+ i + " Número: "); 
	           n[i] = (ent.nextInt());
	       }
          Arrays.sort(n);
          System.out.print("Ordem crescente: "); 
       	  for (int j = 1; j < n.length; j++) 
       	  {
       		System.out.print(n[j]+ " ");       		
          }        
       }
    }

