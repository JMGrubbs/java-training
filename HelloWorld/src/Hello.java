public class Hello {
    public static void main(String[] args) {
        System.out.println("Oh, hi Mark!");

        boolean isAlien = false;

        if (isAlien == false) {
            System.out.println("It's not an Alian...");
        } else {
            System.out.println("ITS AN ALIAN!");
        }

        int topScore = 10;
        if (topScore > 100){
            System.out.println("You got a new high score!");
        } else {
            System.out.println("No new highscore!");
        }

        int secondTopScore = 80;
        if ((topScore < 100) && (secondTopScore > 70)){
            System.out.println("You got a secondTopScore");
        }

        if (topScore > 100 || secondTopScore > 70){
            System.out.println("You did good!");
        }

        topScore = 10000;

        String isCrazy = topScore > 1000 ? "OMG THAT IS CRAZY!" : "Thats pretty good.";
        System.out.println(isCrazy);

        // instanceof only works for non primitive types.
        if (topScore instanceof int) {
            System.out.println("this is an int");
        }

    }
}
