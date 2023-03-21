/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastrastes;

import java.util.Scanner;



public class Cadas {
        private String usuario;
        private String email;
        private int idade;
                Scanner ent = new Scanner (System.in);
 
         
                
         public Cadas (String pUsuario, String pEmail, int pIdade){
                     System.out.println("Entre o nome de seu usuario:");
         this.usuario = ent.nextLine();
                 System.out.println("Entre seu email:");
         this.email = ent.nextLine();
                 System.out.println("Entre sua idade:");
         this.idade = ent.nextInt();
        }
         
 
        public String getUsuario(){
            return usuario;
        }
        public String getEmail(){
            return email;
        }
        public int getIdade(){
            return idade;
        }
        public void setUsuario(String usuario){
            this.usuario = usuario;
        }
        public void setEmail(String email){
            this.email = email;
        }
        public void setIdade(int idade){
            this.idade = idade;
        }
            void cadastrado() {
        System.out.println("Nome: "+ this.usuario + "\nemail: " + this.email + "\nidade: " + this.idade);

    }
}
