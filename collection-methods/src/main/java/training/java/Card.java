package training.java;

import java.util.*;

public record Card(Suit suit, String face, int rank) {

    public enum Suit {
        CLUB, DIAMOND, HEART, SPADE;

        public char getImage(){
            return (new char[]{9827, 9830, 9829, 9824}[this.ordinal()]);
        }
    }

    @Override
    public String toString(){
        int index = face.equals("10") ? 2 : 1;
        String faceString = face.substring(0, index);
        return "%s%c".formatted(faceString, suit.getImage()) + "(" + rank + ")";
    }

    public static Card getNumaricCard(Suit suit, int cardNumber){
        if (cardNumber < 11 && cardNumber > 1){
            return new Card(suit, String.valueOf(cardNumber), cardNumber-2);
        }
        System.out.println("no card of that type");
        return null;
    }

    public static Card getFaceCard(Suit suit, char cardChar){
        int charIndex = "JQKA".indexOf(cardChar);
        if (charIndex > -1){
            return new Card(suit, String.valueOf(cardChar), charIndex + 9);
        }
        System.out.println("no card of that type");
        return null;
    }

    public static List<Card> getStandardDeck(){
        List<Card> deck = new ArrayList<>(52);

        Suit[] suits = Suit.values();
        char[] faceCards = {'J','Q','K','A'};

        for (Suit s : suits) {
            for(int i = 2; i<=10; i++){
                deck.add(Card.getNumaricCard(s, i));
            }
            for(char face : faceCards){
                deck.add(Card.getFaceCard(s, face));
            }
        }
        return deck;
    }


    public static void printDeck(List<Card> deck){
        printDeck(deck, "Current Deck", 4);

    }

    public static void printDeck(List<Card> deck, String description, int rows){
        System.out.println("-----------------------------");
        if (description != null){
            System.out.println(description);
        }

        int cardsInRow = deck.size()/rows;
        for(int i = 0; i < rows; i++){
            int startIndex = i * cardsInRow;
            int endIndex = startIndex + cardsInRow;
            deck.subList(startIndex, endIndex).forEach(c -> System.out.print(c +" "));
            System.out.println();
        }
    }
}
