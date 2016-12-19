package cards;

import tiles.Tile;
import tiles.TileList;

public final class ToNearestCard extends TravelCard {

	private int multiple;
	
	public ToNearestCard(String description, int multiple) {
		super(description, getNearestUtility());
		this.multiple = multiple;
	}

	@Override
	public void cardEffect(){
		super.cardEffect();
		System.out.println("If there is owner pay " + getMultiple() + "x the rent");
	}
	
	private static Tile getNearestUtility(){
		return TileList.ELECTRICCOMPANY;
	}
	
	public int getMultiple(){
		return multiple;
	}
}
