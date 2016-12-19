package cards;

import tiles.Tile;

public class TravelCard extends Card{

	private Tile destination;
	
	public TravelCard(String description, Tile destination) {
		super(description);
		this.destination = destination;
	}
	
	@Override
	public void cardEffect() {
		System.out.println("Go to " + destination.getName());		
	}

	public Tile getDestination() {
		return destination;
	}
}
