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
		boolean on = true;
		System.out.println("Welcome to BlackJack here's your cards");
		dealer.getDealerDeck().shuffleCard();
		dealer.getHand().getCards().add(dealer.dealerDeck().dealCard());
		player.getHand().getCards().add(dealer.dealerDeck().dealCard());
		player.getHand().getCards().add(dealer.dealerDeck().dealCard());
		System.out.println("==================");
		System.out.println(player.getHand());
		System.out.println("==================");
		System.out.println("This is one of the dealers cards");
		System.out.println(dealer.getHand());
		dealer.getHand().getCards().add(dealer.dealerDeck().dealCard());
		

		System.out.println("Do you want to stay or hit?");
		System.out.println("1.Hit");
		System.out.println("2.Stay");
		int choice = sc.nextInt();

		while (player.getHand().getHandValue() < 21)
		switch (choice) {
		case 1:
			player.getHand().getCards().add(dealer.dealerDeck().dealCard());
			System.out.println(player.getHand());
			if(player.getHand().getHandValue() > 21) {
				System.out.println(player.getHand());
				System.out.println("You busted sorry T-T");
				System.exit(0);
			}
			else {
			}
			break;
		case 2:
			while (dealer.getHand().getHandValue() < 17) {
				dealer.getHand().getCards().add(dealer.dealerDeck().dealCard());
			}
			while(dealer.getHand().getHandValue() < player.getHand().getHandValue()) {
				dealer.getHand().getCards().add(dealer.dealerDeck().dealCard());				
			}
			winLose();
			System.exit(0);
			break;
		default:
		}
	}

	public void winLose() {
		if (player.getHand().getHandValue() <= 21
				&& player.getHand().getHandValue() > dealer.getHand().getHandValue()) {
			System.out.println("you have");
			System.out.println(player.getHand());
			System.out.println(player.getHand().getHandValue());
			System.out.println("dealer has");
			System.out.println(dealer.getHand());
			System.out.println(dealer.getHand().getHandValue());
			System.out.println("============");
			System.out.println("You Win");
			System.out.println("============");
		}
		if (player.getHand().getHandValue() > 21 || dealer.getHand().getHandValue() > player.getHand().getHandValue()) {
			System.out.println("you have");
			System.out.println(player.getHand());
			System.out.println(player.getHand().getHandValue());
			System.out.println("dealer has");
			System.out.println(dealer.getHand());
			System.out.println(dealer.getHand().getHandValue());
			System.out.println("You Lose");
			System.out.println("============");
			System.out.println("dealer wins");
			System.out.println("============");

		}
	}
}
