package BlackJack;

public class Player {
	private Hand hand;
	
	

	public Player() {
		hand = new Hand();
	}

	public Hand getHand() {
		return hand;
	}

	public void setHand(Hand hand) {
		this.hand = hand;
	}
}
