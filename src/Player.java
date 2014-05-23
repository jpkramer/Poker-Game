
public class Player {
	private int AccountBalance;
	private Card card1, card2;
	private boolean inGame, allIn;
	
	public Player(int balance) {
		AccountBalance = balance;
		card1 = null;
		card2 = null;
		inGame = true;
		allIn = false;
	}
	
	public void setCards(Card c1, Card c2) {
		card1 = c1;
		card2 = c2;
	}
	
	public Card getCard1() {
		return card1;
	}
	
	public Card getCard2() {
		return card2;
	}
	
	public int getBalance() {
		return AccountBalance;
	}
	
	public int raise(int raiseAmount, int callAmount) {
		this.call(callAmount);
		AccountBalance = AccountBalance - raiseAmount;
		return raiseAmount;
	}
	
	public int call(int callAmount) {
		AccountBalance = AccountBalance - callAmount;
		return callAmount;
	}
	
	public int bet(int betAmount) {
		AccountBalance = AccountBalance - betAmount;
		return betAmount;
	}
	
	public void check() {
		// player does nothing
	}
	
	public void fold() {
		inGame = false;
	}
	
	public boolean inTheGame() {
		return inGame;
	}
	
	public boolean isAllIn() {
		return allIn;
	}
	
	public void win(int potAmount) {
		AccountBalance = AccountBalance + potAmount;
	}
	
	public String toString() {
		//returns player card information and balance
		
	}
	
}

	
