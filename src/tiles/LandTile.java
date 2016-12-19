package tiles;

public final class LandTile extends OwnableTile {

	private String colorGroup;

	private int houseCost;

	private int houseBuilt;

	private int[] rentScale;
	
	public LandTile(int boardIndex, String name, int tileCost, int mortgageValue, String colorGroup, int houseCost, int[] rentScale) {
		super(boardIndex, name, tileCost, mortgageValue);
		this.colorGroup = colorGroup;
		this.houseCost = houseCost;
		this.houseBuilt = 0;
		this.rentScale = new int[6];
		this.rentScale = rentScale.clone();
	}

	@Override
	public int calculateRent() {
		int totalRent = 0;
		
		int numOfHotel = houseBuilt / 5;
		int numOfHouses = houseBuilt % 5;
		
		totalRent = numOfHotel * getRent(5) + getRent(numOfHouses);
		
		return totalRent;
	}

	public String getColorGroup() {
		return colorGroup;
	}

	public int getHouseCost() {
		return houseCost;
	}

	public int getHouseBuilt() {
		return houseBuilt;
	}

	public void buildHouse() {
		houseBuilt++;
	}

	public int getRent(int index){
		return rentScale[index];
	}
}
