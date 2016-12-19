package cards;

public final class ToPropertyCard extends MoneyCard {

	private int moneyGet2;
	
	public ToPropertyCard(String description, int moneyGet, int moneyGet2) {
		super(description, moneyGet);
		this.moneyGet2 = moneyGet2;
	}

	@Override
	public void cardEffect() {
		System.out.println("Player pays $" + getMoneyGet() + " per house, $" + getMoneyGet2() + " per hotel");
	}

	public int getMoneyGet2() {
		return moneyGet2;
	}
}
