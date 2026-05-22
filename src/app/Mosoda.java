
package app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mosoda {
    List<Ruha> ruhak;

    
    public Mosoda() {
        ruhak = new ArrayList<>();
    }
    
    public void bevesz (Ruha ruha){
        ruhak.add(ruha);
    }
    
    public Ruha kiad (int index){
        Ruha ruha = ruhak.get(index);
        ruhak.remove(index);
        return ruha;
    }
    
    public Ruha kiad (String tulaj){
        int i = 0;
        while(ruhak.get(i).getTulaj().equals(tulaj)){
            i++; 
        }
        return kiad(i);
    }
    
    public void mosas(Ruha ruha){
        ruha.kimosva();
    }
    
    public void mosas(){
        for (Ruha ruha : ruhak){
            mosas(ruha);
        }
    }

    public List<Ruha> getRuhak() {
        /* ez így setter*/
        //return ruhak;
        return Collections.unmodifiableList(ruhak);
    }

    @Override
    public String toString() {
        return "Mosoda{" + "ruhak=" + ruhak + '}';
    }
}
