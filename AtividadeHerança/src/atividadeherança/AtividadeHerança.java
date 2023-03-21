package atividadeherança;

public class AtividadeHerança {

    public static void main(String[] args) {
        
        Mamiferos M1 = new Mamiferos();
        M1.setNome("Camelo");
        M1.setPatas(4);
        M1.setComp(150);
        M1.setCor("Amarelo");
        M1.setVelmed(2.0);
        M1.setAmbient("Terra");
        M1.setAlimento("Plantas espinhosas");
        
        Peixe p1 = new Peixe();
        p1.setNome("Tubarão");
        p1.setPatas(0);
        p1.setComp(300);
        p1.setCor("Cinzento");
        p1.setVelmed(1.5);
        p1.setAmbient("Mar");
        p1.setCarac("Barbatanas e cauda");
        
        Mamiferos M2 = new Mamiferos();
        M2.setNome("Urso-do-canadá");
        M2.setPatas(4);
        M2.setComp(180);
        M2.setCor("Vermelho");
        M2.setVelmed(0.5);
        M2.setAmbient("Terra");
        M2.setAlimento("Mel");        
        
        M1.status();
        M1.Ali();
        
        p1.status();
        p1.carac();
        
        M2.status();
        M2.Ali();
    }
    
}
