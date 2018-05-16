
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    Deck deck;
    Card card;

    @Before
    public void before() {
        card = new Card(SuitType.HEARTS, Rank.TEN);
        deck = new Deck(card);

    }

    @Test
    public void checkFillDeck() {
        assertEquals(52, deck.FillDeck());
    }
}
