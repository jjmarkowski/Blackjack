class Card {
	
	private int number;
	private String suit;

	public Card(int number, String suit) {
		setNumber(number);
		setSuit(suit);
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}
}