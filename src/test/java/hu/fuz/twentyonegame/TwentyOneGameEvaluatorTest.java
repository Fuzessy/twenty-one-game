package hu.fuz.twentyonegame;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class TwentyOneGameEvaluatorTest {

    @Test
    public void evaluateCard(){
        TwentyOneGameEvaluator twentyOneGameEvaluator = new TwentyOneGameEvaluator();
        assertEquals(2,twentyOneGameEvaluator.getCardValue(Suite.UNTER));
        assertEquals(3,twentyOneGameEvaluator.getCardValue(Suite.OBER));
        assertEquals(4,twentyOneGameEvaluator.getCardValue(Suite.KING));
        assertEquals(7,twentyOneGameEvaluator.getCardValue(Suite.SEVEN));
        assertEquals(8,twentyOneGameEvaluator.getCardValue(Suite.EIGHT));
        assertEquals(9,twentyOneGameEvaluator.getCardValue(Suite.NINE));
        assertEquals(10,twentyOneGameEvaluator.getCardValue(Suite.TEN));
        assertEquals(11,twentyOneGameEvaluator.getCardValue(Suite.ELEVEN));
        assertEquals(12,twentyOneGameEvaluator.getCardValue(Suite.ACE));
    }
}
