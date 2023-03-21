/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiroprojeto;

/**
 *
 * @author Windows 10
 */
public class PrimeiroProjeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//int vetor[] = new int[5];

 int vetor[] = {2, 4, 9, 61, 7};

 int aux = 0;

 for (int j = 0; j < vetor.length; j++) {
for (int c = 0; c < vetor.length; c++) {
if (vetor[j] < vetor[c]) {
aux = vetor[j];
vetor[j] = vetor[c];
vetor[c] = aux;
}
}
}
for (int i = 0; i < vetor.length; i++) {
System.out.println(vetor[i] + " ");
}
    }
}