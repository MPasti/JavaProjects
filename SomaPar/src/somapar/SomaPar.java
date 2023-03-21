/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package somapar;
import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class SomaPar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner teclado = new Scanner(System.in);
     
     int [] vetor= new int [6];
int somap = 0;
for(int z=1; z<=5;z++){
   System.out.print("Entre a pontuação do " +z+ "° atleta: ");
   vetor[z] = teclado.nextInt();

            if (vetor[z] % 2 ==0 ) {
                somap = somap + vetor[z];
            }
        }
        System.out.println("soma pares: " + somap );
    }
}