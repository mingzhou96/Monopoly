package tiles;

public final class ChanceTile extends SpecialEffectTile {

	public ChanceTile(int boardIndex) {
		super(boardIndex, "Chance");
	}

	@Override
	public void onTrigger() {
		System.out.println("Draw card from chance pile");
	}

}
