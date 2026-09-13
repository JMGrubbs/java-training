package game.adventure;

import game.adventure.game.Game;

public class App {

    public static void main(String[] args) throws Exception {
        Game game = new Game();

        String originalSettings = exec("stty -g < /dev/tty").trim();

        try {
            exec("stty -icanon -echo min 1 time 0 < /dev/tty");

            boolean running = true;

            while (running) {
                clearScreen();

                game.displayScreen();

                System.out.println();
                System.out.println("Use arrow keys or WASD to move.");
                System.out.println("Press Q to quit.");

                int input = System.in.read();

                switch (input) {
                    case 'w', 'W' -> game.moveUp();
                    case 's', 'S' -> game.moveDown();
                    case 'a', 'A' -> game.moveLeft();
                    case 'd', 'D' -> game.moveRight();

                    case 'k', 'K' -> game.moveUp();
                    case 'j', 'J' -> game.moveDown();
                    case 'h', 'H' -> game.moveLeft();
                    case 'l', 'L' -> game.moveRight();

                    case 'q', 'Q' -> running = false;

                    default -> {
                    }
                }
            }

        } finally {
            exec("stty " + originalSettings + " < /dev/tty");
            clearScreen();
        }

        System.out.println("Thanks for playing!");
    }


    private static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }


    private static String exec(String command) throws Exception {
        Process process = new ProcessBuilder(
            "bash",
            "-c",
            command
        ).start();

        process.waitFor();

        return new String(
            process.getInputStream().readAllBytes()
        );
    }
}