import java.util.Random;

class Deck {

	private Card[] deck;

	public Deck() {
		deck = new Card[52];
		setDeck();
		shuffleDeck();
	}

	public void setDeck() {
		int cardNumber = 1;
		for (int i=0; i<deck.length; i=i+4) {
			deck[i] = new Card(cardNumber, "Heart");
			deck[i+1] = new Card(cardNumber, "Spade");
			deck[i+2] = new Card(cardNumber, "Diamond");
			deck[i+3] = new Card(cardNumber, "Club");
			
			cardNumber++;
		}
	}

	public void shuffleDeck() {
		Random random = new Random();
		for (int i=0; i<deck.length; i++) {
			int n = random.nextInt(52);

			int card1Number = deck[i].getNumber();
			String card1Suit = deck[i].getSuit();
			int card2Number = deck[n].getNumber();
			String card2Suit = deck[n].getSuit();

			deck[i].setNumber(card2Number);
			deck[i].setSuit(card2Suit);
			deck[n].setNumber(card1Number);
			deck[n].setSuit(card1Suit);
		}
	}

	public void printDeck() {
		for (int i=0; i<deck.length; i++) {
			System.out.println(i+1 + ": " + deck[i].getNumber() + ", " + deck[i].getSuit());
		}
	}
}