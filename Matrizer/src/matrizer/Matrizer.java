/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrizer;

import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class Matrizer {


    public static void main(String[] args) {

        int matriz [][] = new int [2][3];
        
        Scanner ent = new Scanner(System.in);
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++ ){
                System.out.println("Entre um valor para matriz: ");
                matriz[i][j] = ent.nextInt();
                
            }
        }
                
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(" " + matriz[i][j] + " ");
            }
        }
    }
    
}
