/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendatelefonicamatriz;
import java.util.Scanner; 
/**
 *
 * @author Windows 10
 */
public class AgendaTelefonicaMatriz {

 public static void main(String[] args) {
String matriz[][] = new String[3][2];

 Scanner ent = new Scanner(System.in);

 for (int i = 0; i < 3; i++) {
for (int j = 0; j < 2; j++) {
if (j % 2 == 0) {
System.out.println("Nome");
} else {
System.out.println("Telefone");
}
matriz[i][j] = ent.nextLine();
}
}

 System.out.println("Nome - Telefone");

 for (int i = 0; i < 3; i++) {
for (int j = 0; j < 2; j++) {
System.out.print(" " + matriz[i][j]);
}
System.out.print("\n");
}

 }

}