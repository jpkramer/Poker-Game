import java.util.ArrayList;


public class HandEvaluator {
	
	/* private Card handCard1;
	private Card handCard2;
	private Card boardCard1;
	private Card boardCard2;
	private Card boardCard3;
	private Card boardCard4;
	private Card boardCard5; */
	
	ArrayList<Card> HandInitial = new ArrayList<Card>();
	ArrayList<Card> HandFinal = new ArrayList<Card>();
	
	
	public HandEvaluator(Card hc1, Card hc2, Card bc1, Card bc2, Card bc3, Card bc4, Card bc5) {
		HandInitial.add(hc1);
		HandInitial.add(hc2);
		HandInitial.add(bc1);
		HandInitial.add(bc2);
		HandInitial.add(bc3);
		HandInitial.add(bc4);
		HandInitial.add(bc5);
	}
	
	public boolean isRoyalFlush() {
		
		
	}
	
	public boolean isStraightFlush() {
		
		
	}
	
	public boolean isQuad() {
		
		
	}
	
	public boolean isFullHouse() {
		
		
	}
	
	public boolean isFlush() {
		
		
	}
	
	public boolean isStraight() {
		
		
	}
	
	public boolean isTriple() {
		
		
	}
	
	public boolean isTwoPair() {
		
		
	}
	
	public boolean isPair() {
		
		
	}
	
	public int HandValue() {
		if(isRoyalFlush())
			return 10;
		else if(isStraightFlush())
			return 9;
		else if(isQuad())
			return 8;
		else if(isFullHouse())
			return 7;
		else if(isFlush())
			return 6;
		else if(isStraight())
			return 5;
		else if(isTriple())
			return 4;
		else if(isTwoPair())
			return 3;
		else if(isPair())
			return 2;
		else
			return 1;
	}
	
	public ArrayList<Card> getHandFinal() {
		return HandFinal;
	}
	
}
