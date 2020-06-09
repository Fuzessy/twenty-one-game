package hu.fuz.twentyonegame;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class TwentyOneGameEvaluatorTest {

    private TwentyOneGameEvaluator twentyOneGameEvaluator;

    @Before
    public void setUp() {
        twentyOneGameEvaluator = new TwentyOneGameEvaluator();
    }

    @Test
    public void evaluateCardTest(){
        assertEquals(2,twentyOneGameEvaluator.getCardValue(Suite.UNTER));
        assertEquals(3,twentyOneGameEvaluator.getCardValue(Suite.OBER));
        assertEquals(4,twentyOneGameEvaluator.getCardValue(Suite.KING));
        assertEquals(7,twentyOneGameEvaluator.getCardValue(Suite.SEVEN));
        assertEquals(8,twentyOneGameEvaluator.getCardValue(Suite.EIGHT));
        assertEquals(9,twentyOneGameEvaluator.getCardValue(Suite.NINE));
        assertEquals(10,twentyOneGameEvaluator.getCardValue(Suite.TEN));
        assertEquals(11,twentyOneGameEvaluator.getCardValue(Suite.ACE));
    }

    @Test
    public void evaluateHandWithOneCardTest(){
        assertEquals(4, twentyOneGameEvaluator.evaluateHand(Arrays.asList(Suite.KING)));
    }

    @Test
    public void evaluateHandWithCardsUnder21Test(){
        assertEquals(17, twentyOneGameEvaluator.evaluateHand(Arrays.asList(Suite.NINE,Suite.EIGHT)));
    }

    @Test
    public void evaluateHandWithCardsOver21Test(){
        assertEquals(25, evaluateHand(twentyOneGameEvaluator, Suite.SEVEN));
    }

    @Test
    public void evaluateHandWithCards21Test(){
        assertEquals(21, evaluateHand(twentyOneGameEvaluator, Suite.OBER));
    }

    private int evaluateHand(TwentyOneGameEvaluator twentyOneGameEvaluator, Suite suite) {
        return twentyOneGameEvaluator.evaluateHand(Arrays.asList(Suite.NINE, Suite.NINE, suite));
    }

    @Test
    public void evaluateHandWithCards21WithTwoAceTest(){
        assertEquals(21, twentyOneGameEvaluator.evaluateHand(Arrays.asList(Suite.ACE,Suite.ACE)));
    }
}
