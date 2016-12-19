package tiles;

public final class TaxTile extends SpecialEffectTile {

	private int taxAmount;
	
	public TaxTile(int boardIndex, String name, int taxAmount) {
		super(boardIndex, name);
		this.taxAmount = taxAmount;
	}

	@Override
	public void onTrigger() {
		System.out.println("Collect tax");
	}

	public int getTaxAmount() {
		return taxAmount;
	}
}
