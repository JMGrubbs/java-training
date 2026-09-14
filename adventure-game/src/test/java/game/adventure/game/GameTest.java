package game.adventure.game;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import java.util.List;

public class GameTest {

    @Test
    public void testGame() {
        int gameX = 10;
        int gameY = 10;
        Game testGame = new Game(gameX, gameY);
        GameMap gameMap = testGame.getMap();
        Player gamePlayer = testGame.getPlayer();

        assertTrue(gameMap != null, "Game map did not get created");
        assertTrue(gamePlayer != null, "Game player does not exist.");
        assertTrue(gameMap.getxSize() == gameX && gameMap.getySize() == gameY, "Game does not have the correct map dementions.");
    }

    @Test
    public void testGamePlayerMovement(){
        Game testGame = new Game();
        Player gamePlayer = testGame.getPlayer();

        List<Integer> leftStartX = gamePlayer.parseLocation();
        testGame.moveLeft();
        List<Integer> leftEndX = gamePlayer.parseLocation();
        assertTrue(leftEndX.get(0) == leftStartX.get(0) - 1, "Failed to move player left 1 space.");

        List<Integer> rightStartX = gamePlayer.parseLocation();
        testGame.moveRight();
        List<Integer> rightEndX = gamePlayer.parseLocation();
        assertTrue(rightEndX.get(0) == rightStartX.get(0) + 1, "Failed to move player right 1 space.");

        List<Integer> upStartY = gamePlayer.parseLocation();
        testGame.moveUp();
        List<Integer> upEndY = gamePlayer.parseLocation();
        assertTrue(upEndY.get(1) == upStartY.get(1) - 1, "Failed to move player up 1 space.");

        List<Integer> downStartY = gamePlayer.parseLocation();
        testGame.moveDown();
        List<Integer> downEndY = gamePlayer.parseLocation();
        assertTrue(downEndY.get(1) == downStartY.get(1) + 1, "Failed to move player down 1 space.");
    }

    @Test
    public void testGameAddMoney(){
        Game testGame = new Game();
        Player gamePlayer = testGame.getPlayer();

        int playerMoney = gamePlayer.getMoney();
        testGame.addMoney(gamePlayer);
        int morePlayerMoney = gamePlayer.getMoney();
        assertTrue(playerMoney < morePlayerMoney, "Money did not increase with game.addMoney()");

        playerMoney = gamePlayer.getMoney();
        testGame.addMoney(gamePlayer);
        morePlayerMoney = gamePlayer.getMoney();
        assertTrue(playerMoney < morePlayerMoney, "Money did not increase with game.addMoney()");

    }
}