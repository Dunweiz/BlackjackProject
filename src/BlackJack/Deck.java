package BlackJack;
import java.util.*;
public class Deck {
	private List <Card> cards;

	public Deck() {
	cards = deckOfCards();	
	}
	
	public Deck(List<Card> cards) {
		super();
		this.cards = cards;
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
	public List<Card> getCards() {
		return cards;
	}
	public void setCards(List<Card> cards) {
		this.cards = cards;
	}
	public int checkDeckSize(){
		return cards.size();
	}
	@Override
	public String toString() {
		return "Deck [cards=" + cards + "]";
	}

	public Card dealCard() {
		return cards.remove(0);
	}
	public void shuffleCard() {
		Collections.shuffle(cards);
	}
}
