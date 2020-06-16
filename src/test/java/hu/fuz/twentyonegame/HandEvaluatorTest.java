package hu.fuz.twentyonegame;

import hu.fuz.twentyonegame.model.Suite;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class HandEvaluatorTest {

    private HandEvaluator handEvaluator;

    @Before
    public void setUp() {
        handEvaluator = new HandEvaluator();
    }

    @Test
    public void evaluateCardTest(){
        assertEquals(2, handEvaluator.getCardValue(Suite.UNTER));
        assertEquals(3, handEvaluator.getCardValue(Suite.OBER));
        assertEquals(4, handEvaluator.getCardValue(Suite.KING));
        assertEquals(7, handEvaluator.getCardValue(Suite.SEVEN));
        assertEquals(8, handEvaluator.getCardValue(Suite.EIGHT));
        assertEquals(9, handEvaluator.getCardValue(Suite.NINE));
        assertEquals(10, handEvaluator.getCardValue(Suite.TEN));
        assertEquals(11, handEvaluator.getCardValue(Suite.ACE));
    }

    @Test
    public void evaluateHandWithOneCardTest(){
        assertEquals(4, handEvaluator.evaluateHand(Arrays.asList(Suite.KING)));
    }

    @Test
    public void evaluateHandWithCardsUnder21Test(){
        assertEquals(17, handEvaluator.evaluateHand(Arrays.asList(Suite.NINE,Suite.EIGHT)));
    }

    @Test
    public void evaluateHandWithCardsOver21Test(){
        assertEquals(25, evaluateHand(handEvaluator, Suite.SEVEN));
    }

    @Test
    public void evaluateHandWithCards21Test(){
        assertEquals(21, evaluateHand(handEvaluator, Suite.OBER));
    }

    private int evaluateHand(HandEvaluator handEvaluator, Suite suite) {
        return handEvaluator.evaluateHand(Arrays.asList(Suite.NINE, Suite.NINE, suite));
    }

    @Test
    public void evaluateHandWithCards21WithTwoAceTest(){
        assertEquals(21, handEvaluator.evaluateHand(Arrays.asList(Suite.ACE,Suite.ACE)));
    }
}
