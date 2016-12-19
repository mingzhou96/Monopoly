package tiles;

public final class UtilityTile extends OwnableTile {
	
	public UtilityTile(int boardIndex, String name, int tileCost, int mortgageValue) {
		super(boardIndex, name, tileCost, mortgageValue);
	}

	@Override
	public int calculateRent() {
		/*
		 * Roll 2 dice;
		 * If 1 utility owned, rent equals sum of dice * 4;
		 * if 2 utility owned, rent equals sum of dice * 10;
		 */
		System.err.println("Method not yet implemented.");
		return 0;
	}

}
