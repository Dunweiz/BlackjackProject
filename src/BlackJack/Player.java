package BlackJack;

public class Player {
	private Hand hand = new BlackJackHand();

	public void addCard(Card card) {
		hand.addCard(card);
	}

	public Hand getHand() {
		return hand;
	}

	public void setHand(Hand hand) {
		this.hand = hand;
	}

}
