package cards;

public abstract class MoneyCard extends Card {

	private int moneyGet;

	public MoneyCard(String description, int moneyGet) {
		super(description);
		this.moneyGet = moneyGet;
	}

	@Override
	public abstract void cardEffect();

	public int getMoneyGet() {
		return moneyGet;
	}
}
