package game.adventure.game;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class GameMapTest {

    @Test
    public void shouldCreateThreeByThreeMap() {
        GameMap testMap = new GameMap(3, 3);
        int[][] gameMap = testMap.displayMap();

        assertTrue(
            gameMap.length == 3 && gameMap[0].length == 3,
            "Expected map dimensions to be 3x3"
        );
    }
}