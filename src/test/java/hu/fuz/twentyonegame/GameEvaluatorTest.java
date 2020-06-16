package hu.fuz.twentyonegame;

import hu.fuz.twentyonegame.model.HandResult;
import hu.fuz.twentyonegame.model.Suite;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class GameEvaluatorTest {
    @Test
    public void canPullAnotherSheetTest() {
        GameEvaluator gameEvaluator = new GameEvaluator();
        List<Suite> handUnder15 = Arrays.asList(Suite.OBER);
        assertEquals(HandResult.MUST_PULL_ANOTHER_SHEET, gameEvaluator.evaluateHand(handUnder15));
    }

    @Test
    public void cantPullAnotherSheetTest() {
        GameEvaluator gameEvaluator = new GameEvaluator();
        List<Suite> handOver21 = Arrays.asList(Suite.TEN, Suite.SEVEN, Suite.SEVEN);
        assertEquals(HandResult.MUST_STOP, gameEvaluator.evaluateHand(handOver21));
    }

    @Test
    public void winnerHandTest() {
        GameEvaluator gameEvaluator = new GameEvaluator();
        List<Suite> handExactly21 = Arrays.asList(Suite.TEN, Suite.SEVEN, Suite.KING);
        assertEquals(HandResult.WINNER_HAND, gameEvaluator.evaluateHand(handExactly21));
    }

    @Test
    public void canStopTestTest() {
        GameEvaluator gameEvaluator = new GameEvaluator();
        List<Suite> handBetween14And20 = Arrays.asList(Suite.TEN, Suite.SEVEN);
        assertEquals(HandResult.CAN_STOP, gameEvaluator.evaluateHand(handBetween14And20));
    }
}
