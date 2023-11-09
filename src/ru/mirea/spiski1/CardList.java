package ru.mirea.spiski1;
import java.util.ArrayList;
import java.util.Scanner;
class CardList {
    private ArrayList<Card> cards;

    public CardList() {
        cards = new ArrayList<>();
    }

    public void addCard() {
        Card card = new Card();
        card.readAttributes();
        cards.add(card);
    }

    public void removeCard(int index) {
        if (index >= 0 && index < cards.size()) {
            cards.remove(index);
        } else {
            System.out.println("Верный индекс");
        }
    }

    public void displayCard(int index) {
        if (index >= 0 && index < cards.size()) {
            Card card = cards.get(index);
            card.displayAttributes();
        } else {
            System.out.println("Верный индекс");
        }
    }

    public void clearCards() {
        cards.clear();
    }

    public boolean isEmpty() {
        return cards.isEmpty();
    }
}
