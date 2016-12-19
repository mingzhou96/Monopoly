package cards;

import tiles.TileList;

/*
 * List of cards contained in Monopoly
 */
public final class CardList {

	// Money Cards
	public static final MoneyCard BANKERRORINFAVOR = new ToBankCard("Bank error in your favor-collect $75", 75);
	public static final MoneyCard DOCTORFEE = new ToBankCard("Doctor's fees-Pay $50", -50);
	public static final MoneyCard BIRTHDAY = new ToAllCard("It is your birthday Collect $10 from each player", 10);
	public static final MoneyCard GRANDOPERA = new ToAllCard(
			"Grand Opera Night �C collect $50 from every player for opening night seats", 50);
	public static final MoneyCard INCOMETAXREFUND = new ToBankCard("Income Tax refund �C collect $20 ", 20);
	public static final MoneyCard LIFEINSURANCE = new ToBankCard("Life Insurance Matures �C collect $100 ", 100);
	public static final MoneyCard HOSPITALFEES = new ToBankCard("Pay Hospital Fees of $100 ", -100);
	public static final MoneyCard SCHOOLFEES = new ToBankCard("Pay School Fees of $50 ", -50);
	public static final MoneyCard CONSULTANCYFEE = new ToBankCard("Receive $25 Consultancy Fee ", 25);
	public static final MoneyCard STREETREPAIRS = new ToPropertyCard(
			"You are assessed for street repairs �C $40 per house, $115 per hotel ", -40, -115);
	public static final MoneyCard BEAUTYCONTEST = new ToBankCard(
			"You have won second prize in a beauty contest�C collect $10 ", 10);
	public static final MoneyCard INHERIT = new ToBankCard("You inherit $100", 100);
	public static final MoneyCard SALEOFSTOCK = new ToBankCard("From sale of stock you get $50 ", 50);
	public static final MoneyCard HOLIDAYFUND = new ToBankCard("Holiday Fund matures - Receive $100 ", 100);
	public static final MoneyCard DIVIDEND = new ToBankCard("Bank pays you dividend of $50", 50);
	public static final MoneyCard GENERALREPAIRS = new ToPropertyCard(
			"Make general repairs on all your property �C for each house pay $25 �C for each hotel $100 ", -25, -100);
	public static final MoneyCard PAYPOORTAX = new ToBankCard("Pay poor tax of $15", -15);
	public static final MoneyCard ELECTEDCHAIRMAN = new ToAllCard(
			"You have been elected chairman of the board �C pay each player $50 ", -50);
	public static final MoneyCard BUILDINGLOAN = new ToBankCard("Your building loan matures �C collect $150 ", 150);
	public static final MoneyCard CROSSWORDCOMPETITION = new ToBankCard(
			"You have won a crossword competition - collect $100", 100);

	// Travel Cards
	public static final TravelCard ADVANCETOGO = new TravelCard("Advance to Go (Collect $200) ", TileList.GO);
	public static final TravelCard GOTOJAIL = new TravelCard(
			"Go to jail �C go directly to jail �C Do not pass Go, do not collect $200 ", TileList.JAIL);
	public static final TravelCard GOTRAFALGAR = new TravelCard("Advance to Trafalgar Square.", TileList.TRAFALGAR);
	public static final TravelCard GONEARESTUTILITY = new ToNearestCard(
			"Advance token to nearest Utility. If unowned, you may buy it from the Bank. If owned, throw dice and pay owner a total ten times the amount thrown. ",
			10);
	public static final TravelCard GONEARESTRAILROAD = new ToNearestCard(
			"Advance token to the nearest Railroad and pay owner twice the rental to which he/she is otherwise entitled. If Railroad is unowned, you may buy it from the Bank.",
			2);
	public static final TravelCard GOPALLMALL = new TravelCard("Advance to Pall Mall �C if you pass Go, collect $200 ",
			TileList.PALLMALL);
	public static final TravelCard GOBACKSPACES = new GoBackCard("Go back 3 spaces", 3);
	public static final TravelCard GOKINGSCROSS = new TravelCard(
			"Take a trip to King's Cross Station �C if you pass Go collect $200 ", TileList.KINGSCROSS);
	public static final TravelCard GOMAYFAIR = new TravelCard("Take a walk on the Mayfair �C advance token to Mayfair ",
			TileList.MAYFAIR);
}
