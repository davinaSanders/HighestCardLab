import org.junit.Before;
import org.junit.Test;

import.org.junit.*;

import static org.junit.Assert.assertEquals;

public class CardTest {
        Card card;


    @Before
    public void before(){
        card = new Card(SuitType.HEARTS, Rank.TEN);


    }
}
