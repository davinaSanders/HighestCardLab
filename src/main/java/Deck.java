

import java.util.Arrays;

public class Deck {



    private Card[] deck;

    public Deck(){
        this.deck = new Card[52];
    }

    public int FillDeck(){

        for ( int i=0; i < Card.length; i++) {
            Card[i] = new Card();
            this.deck.add();
        }
        return this.deck.length();
    }




}
