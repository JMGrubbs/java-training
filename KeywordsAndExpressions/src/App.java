import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        double killometers = (100 * 1.609344);
        System.out.println("killometers:" + killometers);

        int highScore = 50;

        if (highScore > 25){
            highScore= 1000 + highScore;

        }

        System.out.println("Testing");

        System.out.println("highScore:" + highScore);
        highScore++;
        System.out.println("highScore:" + highScore);
        highScore--;
        System.out.println("highScore:" + highScore);

        highScore = 0;
        int number_of_rounds = 10;
        int[] all_scores = runGames(number_of_rounds);

        System.out.println("Game final scores: " + Arrays.toString(all_scores));

        highScore = (int) getHighScore(all_scores);

        System.out.println("The High Score is: " + highScore);

    }

    public static int[] runGames(int number_of_rounds) {
        int round = 0;

        int[] final_scores = new int[number_of_rounds];

        while (round < number_of_rounds){
            int final_score = (int) runGame();
            System.out.println(final_score);
            final_scores[round] = final_score;
            round++;
        }

        return final_scores;
    }


    public static int runGame() {
        boolean gameOver = false;
        boolean half_way_there = false;
        int score = 0;

        while (!gameOver) {
            if (score >= 5000) {
                System.out.println("Game is over!");
                gameOver = true;
            } else if (score > 3000 && !half_way_there) {
                System.out.print("You are getting closer: " + score);
                half_way_there = true;
            } else {
                System.out.print("-");
            }

            int random_int = (int) (Math.random() * 91) + 10;
            score += random_int;
        }
        return score;
    }


    public static int getHighScore(int[] scores) {
        int highScore = 0;
        for (int i=0; i<scores.length; i++){
            if (scores[i] > highScore){
                highScore = scores[i];
            }
        }
        return highScore;
    }
}
