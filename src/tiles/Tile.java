package tiles;

public abstract class Tile {
	private int boardIndex;
	private String name;

	public Tile(int boardIndex, String name) {
		this.boardIndex = boardIndex;
		this.name = name;
	}

	public int getBoardIndex() {
		return boardIndex;
	}

	public String getName() {
		return name;
	}

}
