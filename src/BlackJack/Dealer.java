package BlackJack;


public class Dealer extends Player {
	private Deck dealerDeck;
	
	public Dealer() {
		super();
		dealerDeck = new Deck();
	}
	public Deck getDealerDeck() {
		return dealerDeck;
	}
	public void setDealerDeck(Deck dealerDeck) {
		this.dealerDeck = dealerDeck;
	}
	public Hand getDealerCards() {
		return dealerCards;
	}
	public void setDealerCards(Hand dealerCards) {
		this.dealerCards = dealerCards;
	}
	private Hand dealerCards;

	public Hand dealerCards() {
		return dealerCards;
		
	}
	public Deck dealerDeck(){
		dealerDeck.getCards();
		return dealerDeck;
		
	}
	
}

