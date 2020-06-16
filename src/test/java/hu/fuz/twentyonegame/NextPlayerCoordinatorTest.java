package hu.fuz.twentyonegame;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NextPlayerCoordinatorTest {
    private NextPlayerCoordinator nextPlayerCoordinator;

    @Before
    public void setUp() {
        nextPlayerCoordinator = new NextPlayerCoordinator();
    }

    @Test
    public void nextPlayerWithOneAfterStartGameTest(){
        nextPlayerCoordinator.setPlayers(1);
        nextPlayerCoordinator.startGame();
        assertEquals(0, nextPlayerCoordinator.getNextPlayer());
    }

    @Test
    public void nextPlayerWithOneAfterStartGameAndPullSheetTest(){
        nextPlayerCoordinator.setPlayers(1);
        nextPlayerCoordinator.startGame();
        nextPlayerCoordinator.setNextPlayer();
        assertEquals(0, nextPlayerCoordinator.getNextPlayer());
    }

    @Test
    public void nextPlayerWithMoreAfterStartGameTest(){
        nextPlayerCoordinator.setPlayers(2);
        nextPlayerCoordinator.startGame();
        assertEquals(0, nextPlayerCoordinator.getNextPlayer());
    }

    @Test
    public void nextPlayerAfterARoundTest(){
        nextPlayerCoordinator.setPlayers(2);
        nextPlayerCoordinator.startGame();
        nextPlayerCoordinator.setNextPlayer();
        nextPlayerCoordinator.setNextPlayer();
        assertEquals(0, nextPlayerCoordinator.getNextPlayer());
    }
}
