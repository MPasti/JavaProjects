package atividadeherança;

public class Peixe extends Animal{
        private String Caracteristica;
    

    
    public String getCarac(){
        return Caracteristica;
    }
    
   public void setCarac(String Caracteristica) {
        this.Caracteristica = Caracteristica;
    }
   
       void carac() {
        System.out.println("Caracterítisca:" + this.Caracteristica + "\n");

    }
}
