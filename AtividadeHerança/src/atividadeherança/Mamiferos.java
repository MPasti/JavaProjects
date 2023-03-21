package atividadeherança;


public class Mamiferos extends Animal {
       
    private String Alimento;
    

    
    public String getAlimento(){
        return Alimento;
    }
    
   public void setAlimento(String Alimento) {
        this.Alimento = Alimento;
    }
          void Ali() {
        System.out.println("Alimento:" + this.Alimento + " \n");

    }
}
