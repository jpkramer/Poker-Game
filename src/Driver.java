
public class Driver {
	
	/*
	main
	
	create deck of cards
	have current bet variable
	have current pot varianble
	flop 1,2,3 card variables
	turn card variable
	river card variable
	
	have table card string
	
	print Welcome!

	ask how many players
	ask how much money each player starts with
	create that many players 
	add players to array list ---- overall list
	
	print Game Started!
	
	Big Loop ----- Full Game while flag does not equal false and overall list length > 1
	
	add players from overall list to array list ---- in-hand list
	
	Inner Loop ----- While in-hand list of players length > 1
	
	use random number generator for 0-51 to remove two cards from the deck to set each players cards ----- loop through in-hand list
	
	use random number generator to pick cards for the flop, turn, and river;
	
	loops through players, prints their card info, and asks bet, call, raise, fold, check
	account for someone who is ALL IN
	check to see if current bet exists for each command.
	set current bet and current pot.
	depending on decision print different responses
	remove players from arraylist if they fold (player.inTheGame() = false)
	before moving on to another player asks user to press enter when ready to continue-----check to only accept enter input
	
	at the end of each betting cycle refresh current bet
	
	add table card names to table card string during appropriate rounds
	print the table card string
	
	at end of betting input player hands who are still in the in-hand list ----- loop through list comparing to last "winner"
	
	check the account balance of players and remove them from overall list
	
	at the end of a round ask to play another hand or to quit (set flag in Big Loop to false)
	if play another round, then add players back to the ArrayList
	
	
	
	*/
	
	
}
