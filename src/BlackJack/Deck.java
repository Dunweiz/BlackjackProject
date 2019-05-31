package BlackJack;
import java.util.*;
public class Deck {
	private List <Card> cards;

	public Deck() {
	cards = deckOfCards();	
	}
	private List<Card> deckOfCards(){
		List<Card> deck = new ArrayList<>(52);
		for(Suit suit : Suit.values()) {
			for(Rank rank : Rank.values()) {
				deck.add(new Card(rank, suit));
			}
		}
		return deck;
	}
	public int checkDeckSize(){
		return cards.size();
	}
	public Card dealCard() {
		return cards.remove(0);
	}
	public void shuffleCard() {
		Collections.shuffle(cards);
	}
}
