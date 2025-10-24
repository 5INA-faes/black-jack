public class Giocatore {
    private String nome;
    private Mano mano;

    public Giocatore(String nome) {
        this.nome = nome;
        this.mano = new Mano();
    }

    public void riceviCarta(Carta c) {
        mano.aggiungiCarta(c);
    }

    public int getPunteggio() {
        return mano.getPunteggio();
    }

    public boolean isSballato() {
        return mano.isSballato();
    }

    @Override
    public String toString() {
        return nome + " -> " + mano.toString();
    }
}
