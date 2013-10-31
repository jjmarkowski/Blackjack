import java.util.Random;

class Deck {

	private Card[] deck;
	private Int deckCount;

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
			int n = random.nextInt(52-i) + i;

			Card extraCard = deck[i];
			deck[i] = deck[n];
			deck[n] = extraCard;

		}
	}

	public void printDeck() {
		for (int i=0; i<deck.length; i++) {
			System.out.println(i+1 + ": " + deck[i].getNumber() + ", " + deck[i].getSuit());
		}
	}
}