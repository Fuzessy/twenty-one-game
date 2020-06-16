package hu.fuz.twentyonegame;

public class NextPlayerCoordinator {
    private int playersCount;
    private int nextPlayer;

    public void setPlayers(int playersIndex) {
        this.playersCount = playersIndex;
    }

    public void startGame() {
        this.nextPlayer = 0;
    }

    public int getNextPlayer() {
        return nextPlayer;
    }

    public void setNextPlayer() {
        if(nextPlayer >= playersCount - 1){
            nextPlayer = 0;
        }else{
            nextPlayer++;
        }
    }
}
