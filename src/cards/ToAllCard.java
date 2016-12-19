package cards;

public final class ToAllCard extends MoneyCard {

	public ToAllCard(String description, int moneyGet) {
		super(description, moneyGet);
	}

	@Override
	public void cardEffect() {
		System.out.println("Collect " + getMoneyGet() + " from everyone");
	}

}
