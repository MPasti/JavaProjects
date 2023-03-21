
package exemploclasseb;

public class Cachorro {
        String Nome;
        String Cor;
        boolean dormindo;
        
        void dormir(){
           this.dormindo =false;
        }
        void acordar(){
           this.dormindo =true;
        }
        
        void latir(){
            if (dormindo == false){
                System.out.println("Estou latindo!! au au au - bem cadelinha");
                
        }else{
               System.out.println("Yo stoy a mimir - zzzzz"); 
            }
                
        }
        
        void status(){
            System.out.println("Nome: " + this.Nome);
            System.out.println("Cor: " + this.Cor);
            System.out.println("Dormindo: " + this.dormindo);
        }
}
