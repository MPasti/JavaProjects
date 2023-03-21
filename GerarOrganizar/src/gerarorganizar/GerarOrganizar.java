
package gerarorganizar;

import java.util.Arrays;
import java.util.Scanner;

public class GerarOrganizar {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] array = new int[7];

        for (int i = 1; i < 6; i++) {
            System.out.println("Entre a pontuaçã do "+i+"° atleta: ");
            int num = entrada.nextInt();
            array[i] =num;
        }

        Arrays.sort(array); 
        
        int maior=array[6];
        int menor=array[2]; 
        
System.out.println("Maior pontuação = "+maior+"\nMenor pontuação = "+menor);
    }
}
