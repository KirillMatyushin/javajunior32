package lesson10;

import java.util.ArrayList;
import java.util.Scanner;

public class Player implements IPlayer {
    private String name;
    private ArrayList<Card> hand = new ArrayList<>();
    private boolean canWinn = true;

    public boolean isCanWinn() {
        return canWinn;
    }

    public void setCanWinn(boolean canWinn) {
        this.canWinn = canWinn;
    }

    public String getName() {
        return name;
    }

    @Override
    public void addCardToHand(Card card) {
        hand.add(card);

    }

    @Override
    public boolean needsCard() {
        this.openHand(); // Еще не реализован
        System.out.println("Нужна ли еще одна карта?");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("Да")) {
            return true;
        }
        return false;
    }

    @Override
    public void openHand() {
        System.out.println("------ ВАШИ КАРТЫ ------ " + this.name);
        for (Card c : hand) {
            System.out.println(c.getName());
        }
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public int valuesHand() {
        int values = 0;
        for (Card c : hand) {
            values = values + c.getValue();
        }
        return values;
    }
}
