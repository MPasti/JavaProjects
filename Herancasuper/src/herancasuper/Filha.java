package herancasuper;

public class Filha extends papito{
    private String nomeFilha;
    
    public Filha(String nomeFilha, String nomePai){
        super(nomePai);
        this.nomeFilha = nomeFilha;
    }
    
    @Override
    public void nome(){
        System.out.println("O nome da filha é: " + this.nomeFilha + ", e o do pai é: " + nomePai +".");
    }
    
}
