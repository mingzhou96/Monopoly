package tiles;

public abstract class SpecialEffectTile extends Tile {

	public SpecialEffectTile(int boardIndex, String name) {
		super(boardIndex, name);
	}

	public abstract void onTrigger();
}
