package aula07;
public class LutaLivre {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];
        
        l[0] = new Lutador("Caio de Lima Viana", "Brasil", 19, 1.55f, 59.9f, 1,0, 20);
        l[1] = new Lutador("Antonio Wilton", "Brasil", 55, 1.70f, 80.9f, 10,1, 20);
        l[2] = new Lutador("Wesley Alves", "Brasil", 27, 1.75f, 99.9f, 1,0, 20);
        l[3] = new Lutador("Wescley Alves ", "Brasil", 31, 1.75f, 80.9f, 10,1, 3);
        
        
        l[3].apresentar();
        l[3].status();
    }
}
