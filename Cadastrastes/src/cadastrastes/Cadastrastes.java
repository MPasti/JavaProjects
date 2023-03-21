package cadastrastes;

import java.util.Scanner;

public class Cadastrastes {

    
    public static void main(String[] args) {

        Scanner ent = new Scanner (System.in);

        
        Cadas p1 = new Cadas("Pedro", "Naruto@gmail.com", 21);
        Cadas p2 = new Cadas("Renato","Renatinho@hotmail.com", 25);
      

    p1.cadastrado();
    p2.cadastrado();
    }
}
