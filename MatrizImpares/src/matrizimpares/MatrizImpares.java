/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrizimpares;
import java.util.Scanner;


public class MatrizImpares {


    public static void main(String[] args) {
        int matriz [] = new int [10];
        
        Scanner ent = new Scanner(System.in);
        
        for (int i = 0; i < 10; i++) {
                System.out.println("Entre um valor para o vetor: ");
                matriz[i] = ent.nextInt();
                
            }
        
                for (int i = 0; i < 10; i++) {
               if (matriz[i]% 2 != 0) 
                System.out.print(matriz[i] + " ");
                
            }
        }
                
    }
    
