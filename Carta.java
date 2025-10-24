
public class Carta {

    private String seme;
    private String valore;
    private int punteggio;

    public Carta(String seme, String valore, int punteggio) {
        this.seme = seme;
        this.valore = valore;
        this.punteggio = punteggio;
    }

    public String getSeme() {
        return seme;
    }

    public String getValore() {
        return valore;
    }

    public int getPunteggio() {
        return punteggio;
    }
    
    @Override
    public String toString() {
        return valore + " di " + seme + " (" + punteggio + ")";
    }
    
}
