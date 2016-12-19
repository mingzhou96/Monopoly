package cards;

public final class ToBankCard extends MoneyCard {

	public ToBankCard(String description, int moneyGet) {
		super(description, moneyGet);
	}

	@Override
	public void cardEffect() {
		System.out.println("Collect " + getMoneyGet() + " from bank");
	}

}
