package tiles;

public final class StationTile extends OwnableTile {

	private static int baseRent = 25;
	
	public StationTile(int boardIndex, String name, int tileCost, int mortgageValue) {
		super(boardIndex, name, tileCost, mortgageValue);
	}

	@Override
	public int calculateRent() {
		/*
		 * Rent equals
		 * 2 ^ (Number of station owned - 1) * 25;
		 */
		System.err.println("Method not yet implemented.");
		return 0;
	}

	public static int getBaseRent() {
		return baseRent;
	}
}
