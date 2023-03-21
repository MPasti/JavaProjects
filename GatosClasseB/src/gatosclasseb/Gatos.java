
package gatosclasseb;

public class Gatos {
        
        String Nome;
        String Cor;
        boolean dormindo;
        
        void dormir(){
           this.dormindo =false;
        }
        void acordar(){
           this.dormindo =true;
        }
        
        void miar(){
            if (dormindo == false){
                System.out.println("Estou miando!! miau miau miau - >//<");
                
        }else{
               System.out.println("Estou a mimir - zzzzz"); 
            }
                
        }
        
        void status(){
            System.out.println("Nome: " + this.Nome);
            System.out.println("Cor: " + this.Cor);
            System.out.println("Dormindo: " +this.dormindo);
        }
}
