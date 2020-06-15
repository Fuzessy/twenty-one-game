package hu.fuz.twentyonegame;

import hu.fuz.twentyonegame.model.HandResult;

import java.util.List;

public class GameEvaluator {
    private final HandEvaluator handEvaluator = new HandEvaluator();

    public HandResult evaluateHand(List<Suite> hand) {
        int handValue = handEvaluator.evaluateHand(hand);
        if(handValue < 14)
            return HandResult.MUST_PULL_ANOTHER_SHEET;
        else if(handValue > 21)
            return  HandResult.MUST_STOP;
        else if( handValue == 21)
            return HandResult.WINNER_HAND;
        return HandResult.CAN_STOP;
    }
}
