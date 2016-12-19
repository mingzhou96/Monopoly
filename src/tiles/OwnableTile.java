package tiles;

public abstract class OwnableTile extends Tile {

	private int tileCost;
	
	private int mortagageValue;
	
	public OwnableTile(int boardIndex, String name, int tileCost, int mortgageValue) {
		super(boardIndex, name);
		
		this.tileCost = tileCost;
		this.mortagageValue = mortgageValue;
	}

	public int getTileCost(){
		return tileCost;
	}
	
	public int getMortgageValue(){
		return mortagageValue;
	}
	
	public abstract int calculateRent();
}
