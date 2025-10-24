BLACKJACK

Classe Carta
Attributi

seme: String

valore: String

punteggio: int

Metodi

Carta(seme: String, valore: String, punteggio: int)

getSeme(): String

getValore(): String

getPunteggio(): int

toString(): String




Classe Mazzo
Attributi

carte: List<Carta>

Metodi

Mazzo()

mescola()

pescaCarta(): Carta

isEmpty(): boolean





Classe Mano
Attributi

carte: List<Carta>

Metodi

aggiungiCarta(c: Carta)

getPunteggio(): int

isSballato(): boolean

toString(): String




Classe Giocatore
Attributi

nome: String

mano: Mano

Metodi

Giocatore(nome: String)

riceviCarta(c: Carta)

getPunteggio(): int

isSballato(): boolean

toString(): String





Classe Mazziere (estende Giocatore)
Metodi

gioca(Mazzo m)




Classe GiocoBlackjack
Attributi

mazzo: Mazzo

giocatori: List<Giocatore>

mazziere: Mazziere

Metodi

inizializza()

distribuisciCarteIniziali()

turnoGiocatore(g: Giocatore)

turnoMazziere()

determinaVincitore(): Giocatore

avvia()




Relazioni

Mazzo contiene Carta

Mano contiene Carta

Giocatore ha Mano

Mazziere è un Giocatore

GiocoBlackjack gestisce Mazzo, Giocatore, Mazziere

