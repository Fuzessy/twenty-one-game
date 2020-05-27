package hu.fuz.twentyonegame;

import java.util.List;

public class TwentyOneGameEvaluator {

    protected int getCardValue(Suite cardSuite) {
        switch (cardSuite){
            case UNTER: return 2;
            case OBER: return 3;
            case KING: return 4;
            case SEVEN: return 7;
            case EIGHT: return 8;
            case NINE: return 9;
            case TEN: return 10;
            case ELEVEN: return 11;
            case ACE: return 12;
        }
        throw new NullPointerException();
    }
}
