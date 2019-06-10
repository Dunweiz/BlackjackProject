package BlackJack;


public class Dealer extends Player {
	Deck dealerDeck = new Deck();
	
	public void Shuffle() {
		dealerDeck.shuffleCard();
	}
	public Deck getDeck() {
		return dealerDeck;
	}

	public void setDeck(Deck deck) {
		deck = dealerDeck;
	}
	
	
	
}

