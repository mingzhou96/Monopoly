package tiles;

public final class CommunityChestTile extends SpecialEffectTile {

	public CommunityChestTile(int boardIndex) {
		super(boardIndex, "Community Chest");
	}

	@Override
	public void onTrigger() {
		System.out.println("Draw a community chest card from pile");
	}

}
