package cards;

import tiles.Tile;
import tiles.TileList;

public final class GoBackCard extends TravelCard {

	public GoBackCard(String description, int numOfSpaces) {
		super(description, goBackSpaces(numOfSpaces));
	}
	
	private static Tile goBackSpaces(int numOfSpaces){
//		System.out.println("Calculate tiles 3 spaces behind current tile");
		return TileList.GO;
	}

}
