package black.jack;

import java.util.ArrayList;
import java.util.Collections;

public class Mazzo {
    private ArrayList<Carta> carte;
    private static int i;

    public Mazzo() {
        
    }
    
    public void mescola(){
        Collections.shuffle(carte);
    }
    
    public Carta pescaCarta(){
        if(i<312){
            return carte.get(i);
        }else{
            
        }
    }
    
    public boolean isEmpty(){
        
    }
}
