import java.util.ArrayList;
import java.util.List;

public class Mano {
    
    private List<Carta> carte;

    
    public Mano() {
        carte = new ArrayList<>();
    }

    
    public void aggiungiCarta(Carta c) {
        carte.add(c);
    }

    
    public int getPunteggio() {
        int totale = 0;
        int assi = 0;

        
        for (Carta c : carte) {
            totale += c.getPunteggio();
            if (c.getValore().equals("A")) {
                assi++;
            }
        }

        
        while (totale > 21 && assi > 0) {
            totale -= 10;
            assi--;
        }

        return totale;
    }

    
    public boolean isSballato() {
        return getPunteggio() > 21;
    }

    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Carta c : carte) {
            sb.append(c.toString()).append(", ");
        }
        sb.append("Punteggio: ").append(getPunteggio());
        return sb.toString();
    }
}
