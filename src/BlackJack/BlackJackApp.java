package BlackJack;

import java.util.Scanner;

public class BlackJackApp {
	Player player = new Player();
	Dealer dealer = new Dealer();
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		BlackJackApp bja = new BlackJackApp();
		bja.run();

	}

	public void run() {
		System.out.println("Welcome to BlackJack here's your cards");
		dealer.Shuffle();
		dealer.addCard(dealer.dealerDeck.dealCard());
		for (int i = 0; i < 2; i++) {
			player.addCard(dealer.dealerDeck.dealCard());
		}
		System.out.println("==================");
		System.out.println("Player");
		System.out.println(player.getHand());
		System.out.println("==================");
		System.out.println("Dealer");
		System.out.println(dealer.getHand());
		dealer.addCard(dealer.dealerDeck.dealCard());
		anyOneHave21();
		do {
			System.out.println("==================");
			System.out.println(player.getHand().getHandValue());
			System.out.println("==================");
			System.out.println("Do you want to stay or hit?");
			System.out.println("1.Hit");
			System.out.println("2.Stay");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				player.addCard(dealer.dealerDeck.dealCard());
				System.out.println(player.getHand());
				didYouBust();
				break;
			case 2:
				System.out.println("dealer has");
				System.out.println(dealer.getHand());
				while (dealer.getHand().getHandValue() < 17) {
					dealer.addCard(dealer.dealerDeck.dealCard());
					;
					System.out.println(dealer.getHand());
				}
				didYouBust();
				while (dealer.getHand().getHandValue() < player.getHand().getHandValue()) {
					System.out.println("dealer draws a card");
					dealer.addCard(dealer.dealerDeck.dealCard());
				}
				didYouBust();
				anyOneHave21();
				winLose();
				break;
			default:
			}
		} while (player.getHand().getHandValue() < 21);
		winLose();
	}

	public void winLose() {

		if (player.getHand().getHandValue() > dealer.getHand().getHandValue()) {
			System.out.println("dealer has");
			System.out.println(dealer.getHand());
			System.out.println(dealer.getHand().getHandValue());
			System.out.println("============");
			System.out.println("You Win ^(^.^)^");
			System.exit(0);
		}
		if (player.getHand().getHandValue() < dealer.getHand().getHandValue()) {
			System.out.println("dealer has");
			System.out.println(dealer.getHand());
			System.out.println(dealer.getHand().getHandValue());
			System.out.println("YOU LOSE T-T");
			System.out.println("============");
			System.out.println("DEALER WINS");
			System.exit(0);
		}
	}

	public void anyOneHave21() {
		if (player.getHand().getHandValue() == 21) {
			System.out.println(player.getHand().getCards());
			System.out.println(player.getHand().getHandValue());
			System.out.println("Dealer Busted");
			System.out.println("============");
			System.out.println("YOU WIN ^-^");
			System.exit(0);
		}
		if (dealer.getHand().getHandValue() == 21) {
			System.out.println("dealer has");
			System.out.println(dealer.getHand());
			System.out.println(dealer.getHand().getHandValue());
			System.out.println("YOU LOSE T-T");
			System.out.println("============");
			System.out.println("DEALER WINS");
			System.exit(0);
		}
	}

	public void didYouBust() {
		if (dealer.getHand().getHandValue() > 21) {
			System.out.println(dealer.getHand().getCards());
			System.out.println(dealer.getHand().getHandValue());
			System.out.println("Dealer Busted");
			System.out.println("YOU WIN ^-^");
			System.exit(0);
		}
		if (player.getHand().getHandValue() > 21) {
			System.out.println(player.getHand().getCards());
			System.out.println(player.getHand().getHandValue());
			System.out.println("You Busted");
			System.out.println("YOU LOSE T-T");
			System.exit(0);
		}
	}
}
