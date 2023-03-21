package atividadeherança;

public class Animal {
    
    private String nome;
    private double comprimento;
    private int patas;
    private String cor;
    private String ambiente;
    private double velmed;
    

    
    public String getNome(){
        return nome;
    }
    
   public void setNome(String nome) {
        this.nome = nome;
    }
   
 public int getPata(){
        return patas;
    }
    
   public void setPatas(int patas) {
        this.patas = patas;
    }
   
 public String getCor(){
        return cor;
    }
    
   public void setCor(String cor) {
        this.cor = cor;
    }   
   
 public double getComp(){
        return comprimento;
    }
    
   public void setComp(double comprimento) {
        this.comprimento = comprimento;
    }     

 public String getAmbient(){
        return ambiente;
    }
    
   public void setAmbient(String ambiente) {
        this.ambiente = ambiente;
    }   

 public double getVelmed(){
        return velmed;
    }
    
   public void setVelmed(double velmed) {
        this.velmed = velmed;
    }       
   
    void status() {
        System.out.println("##### "+ this.nome +" #####"+ "\nComprimento: "+ 
        this.comprimento + "\nPatas: " + this.patas + "\nCor: " + this.cor + 
        "\nAmbiente: " + this.ambiente + "\nVelocidade média: " + this.velmed);

    }
            
}
