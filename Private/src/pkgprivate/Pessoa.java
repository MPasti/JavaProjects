package pkgprivate;

public class Pessoa {
    
    private String nome;
    String data_nasc;
    double peso;
    double altura;
    private int idade;
    
    public Pessoa (String pNome, int pIdade){
    this.nome = pNome;
    this.idade = pIdade;
    }
    
    public String getNome(){
        return nome;
    }
    
   public void setNome(String nome) {
        this.nome = nome;
    }
   
        public int getIdade(){
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    void status() {
        System.out.println("Nome: "+ this.nome +"\nidade: " + this.idade);

    }
            
    
}

