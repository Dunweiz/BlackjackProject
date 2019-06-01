package BlackJack;

import java.util.ArrayList;
import java.util.List;

public class BlackJackHand extends Hand{
	List<Card> blackJ = new ArrayList<>();
	public void getValue(Card c) {
		blackJ.add(c);
		blackJ.add(c);
		getHandValue();
		
	}

}
