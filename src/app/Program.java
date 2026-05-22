
package app;


public class Program {
    public static void main(String[] args) {
        Mosoda mosoda = new Mosoda();
        Ruha ruha = new Ruha("Ede");
        mosoda.bevesz(ruha);
        mosoda.bevesz(new Ruha("Anna"));
        mosoda.bevesz(new Ruha("Dani"));
        mosoda.bevesz(new Ruha("Norbi"));
        mosoda.bevesz(new Ruha("Bence"));
        
        Ruha kivettRuha1 = mosoda.kiad(1);
        System.out.println("kivett: [1] ruha: " + kivettRuha1);
        
    }
}
