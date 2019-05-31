package BlackJack;

import java.util.ArrayList;
import java.util.List;

public class Hand {
	List<Card> hand = new ArrayList<>();

	public int getHandValue() {
		int handValue = 0;
		for (Card card : hand) {
			handValue += card.getValue();
		}
		return handValue;
	}

	public void addCard(Card c) {
		hand.add(c);
	}

	public void clearHand() {
		hand.clear();
	}

	public List<Card> getCards() {
		return hand;
	}

	public String toString() {
		String v = "";
		for (Card card : hand) {
			v = card.toString();
		}
		return v;
	}
}
