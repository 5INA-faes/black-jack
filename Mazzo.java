package black.jack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mazzo {
    private List<Carta> carte;
    
    public Mazzo() {
        carte = new ArrayList<>();
        inizializzaMazzo();
    }

    private void inizializzaMazzo() {
        String[] semi = {"Cuori", "Quadri", "Fiori", "Picche"};
        String[] valori = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        for (String seme : semi) {
            for (String valore : valori) {
                int punteggio;

                // Assegno punteggio in base al valore
                if (valore.equals("J") || valore.equals("Q") || valore.equals("K")) {
                    punteggio = 10;
                } else if (valore.equals("A")) {
                    punteggio = 11; // l’Asso può valere 1 o 11, ma inizialmente 11
                } else {
                    punteggio = Integer.parseInt(valore);
                }

                carte.add(new Carta(seme, valore, punteggio));
            }
        }
    }

    public void mescola() {
        Collections.shuffle(carte);
    }

    public Carta pescaCarta() {
        if (!isEmpty()) {
            return carte.remove(0);
        }
        return null;
    }

    public boolean isEmpty() {
        return carte.isEmpty();
    }
}
