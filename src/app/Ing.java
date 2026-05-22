
package app;


public class Ing extends Ruha{
    private double szinIntenzitas;

    public Ing(String tulaj) {
        /* az egységbezárt és kezeli a privát adattagot*/
        super(tulaj);
        /* saját speciális adattag*/
        this.szinIntenzitas = 100;
    }

    public double getSzinIntenzitas() {
        return szinIntenzitas;
    }

    @Override
    public String toString() {
        String os = super.toString();
        return "\n\t <|-- Ing{" + "szinIntenzitas=" + szinIntenzitas + '}';
    }

    @Override
    public void kimosva() {
        /* az egységbezárt és kezeli a privát adattagot*/
        super.kimosva();
        /* saját speciális adattag*/
        szinIntenzitas *= .03;
    }
    
}
