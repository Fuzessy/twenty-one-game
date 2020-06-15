package hu.fuz.twentyonegame;

import java.util.List;

public class HandEvaluator {

    protected int getCardValue(Suite cardSuite) {
        switch (cardSuite){
            case UNTER: return 2;
            case OBER: return 3;
            case KING: return 4;
            case SEVEN: return 7;
            case EIGHT: return 8;
            case NINE: return 9;
            case TEN: return 10;
            case ACE: return 11;
        }
        throw new InvalidCardSuiteException();
    }

    public int evaluateHand(List<Suite> cards) {
        return isExactlyTwoAce(cards) ? 21 : sumCardsByRank(cards);
    }

    private Integer sumCardsByRank(List<Suite> cards) {
        return cards.stream().map(this::getCardValue).reduce(Integer::sum).get();
    }

    private boolean isExactlyTwoAce(List<Suite> cards) {
        return cards.size() == 2 && cards.get(0) == Suite.ACE && cards.get(1) == Suite.ACE;
    }
}
