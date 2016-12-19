package tiles;

/*
 * List of tiles contained in Monopoly
 */
public final class TileList {

	//Special Effect Tiles
	//Go
	public final SpecialEffectTile GO = new SpecialEffectTile(0, "Go") {
		@Override
		public void onTrigger() {
			//Collect 200$
			System.err.println("Collect 200$");
		}
	};
	
	//Jail
	public final SpecialEffectTile JAIL = new SpecialEffectTile(10, "Jail") {
		
		@Override
		public void onTrigger() {
			System.err.println("No effect");
		}
	};
	
	//Free Parking
	public final SpecialEffectTile FREEPARKING = new SpecialEffectTile(20, "Free Parking") {
		
		@Override
		public void onTrigger() {
			System.err.println("No effect");
		}
	};
	
	//Go To Jail
	public final SpecialEffectTile GOTOJAIL = new SpecialEffectTile(30, "Go To Jail") {
		
		@Override
		public void onTrigger() {
			System.err.println("Go to jail");
		}
	};
	
	//Community Chests
	public final CommunityChestTile COMMUNITYCHEST1 = new CommunityChestTile(2);
	public final CommunityChestTile COMMUNITYCHEST2 = new CommunityChestTile(17);
	public final CommunityChestTile COMMUNITYCHEST3 = new CommunityChestTile(33);
	
	//Chances
	public final ChanceTile CHANCE1 = new ChanceTile(8);
	public final ChanceTile CHANCE2 = new ChanceTile(22);
	public final ChanceTile CHANCE3 = new ChanceTile(36);
	
	//Income Tax
	public final TaxTile INCOMETAX = new TaxTile(4, "Income Tax", 200);
	public final TaxTile SUPERTAX = new TaxTile(38, "Super Tax", 100);
	
	// Color Groups
	public final String BROWN = "Brown";
	public final String LIGHTBLUE = "Light Blue";
	public final String PINK = "Pink";
	public final String ORANGE = "Orange";
	public final String RED = "Red";
	public final String YELLOW = "Yellow";
	public final String GREEN = "Green";
	public final String DARKBLUE = "Dark Blue";

	// Ownable Tiles

	// Utility Tiles
	public final UtilityTile ELECTRICCOMPANY = new UtilityTile(12, "Electric Company", 150, 75);
	public final UtilityTile WATERWORKS = new UtilityTile(28, "Water Works", 150, 75);
	// Station Tiles
	public final StationTile KINGSCROSS = new StationTile(5, "King's Cross Station", 200, 100);
	public final StationTile MARYLEBONE = new StationTile(15, "Marylebone Station", 200, 100);
	public final StationTile FENCHURCH = new StationTile(25, "Fenchurch St Station", 200, 100);
	public final StationTile LIVERPOOL = new StationTile(35, "Liverpool Street Station", 200, 100);
	// Land Tiles
	// Brown
	public final LandTile OLDKENT = new LandTile(1, "Old Kent Road", 60, 50, BROWN, 30,
			new int[] { 2, 10, 30, 90, 160, 250 });
	public final LandTile WHITECHAPEL = new LandTile(3, "Whitechapel Road", 60, 50, BROWN, 30,
			new int[] { 4, 20, 60, 180, 360, 450 });
	// Light Blue
	public final LandTile ANGELISLINGTON = new LandTile(6, "The Angel Islington", 100, 50, LIGHTBLUE, 50,
			new int[] { 6, 30, 90, 270, 400, 550 });
	public final LandTile EUSTON = new LandTile(8, "Euston Road", 100, 50, LIGHTBLUE, 50,
			new int[] { 6, 30, 90, 270, 400, 550 });
	public final LandTile PENTONVILLE = new LandTile(9, "Pentonville Road", 120, 60, LIGHTBLUE, 50,
			new int[] { 8, 40, 100, 300, 450, 600 });
	// Pink
	public final LandTile PALLMALL = new LandTile(11, "Pall Mall", 140, 70, PINK, 100,
			new int[] { 10, 50, 150, 450, 625, 750 });
	public final LandTile WHITEHALL = new LandTile(13, "Whitehall", 140, 70, PINK, 100,
			new int[] { 10, 50, 150, 450, 625, 750 });
	public final LandTile NORTHUMBERLAND = new LandTile(14, "Northumberland Avenue", 160, 80, PINK, 100,
			new int[] { 12, 60, 180, 500, 700, 900 });
	// Orange
	public final LandTile BOWSTREET = new LandTile(16, "Bow Street", 180, 90, ORANGE, 100,
			new int[] { 14, 70, 200, 550, 750, 950 });
	public final LandTile MARLBOROUGH = new LandTile(18, "Marlborough Street", 180, 90, ORANGE, 100,
			new int[] { 14, 70, 200, 550, 750, 950 });
	public final LandTile VINESTREET = new LandTile(19, "Vine Street", 200, 100, ORANGE, 100,
			new int[] { 16, 80, 220, 600, 800, 1000 });
	// Red
	public final LandTile STRAND = new LandTile(21, "Strand", 220, 110, RED, 150,
			new int[] { 18, 90, 250, 700, 875, 1050 });
	public final LandTile FLEETSTREET = new LandTile(23, "Fleet Street", 220, 110, RED, 150,
			new int[] { 18, 90, 250, 700, 875, 1050 });
	public final LandTile TRAFALGAR = new LandTile(24, "Trafalgar Square", 240, 120, RED, 150,
			new int[] { 20, 100, 300, 750, 925, 1100 });
	// Yellow
	public final LandTile LEICESTER = new LandTile(26, "Leicester Square", 260, 150, YELLOW, 150,
			new int[] { 22, 110, 330, 800, 975, 1150 });
	public final LandTile CONVENTRY = new LandTile(27, "Conventry Street", 260, 150, YELLOW, 150,
			new int[] { 22, 110, 330, 800, 975, 1150 });
	public final LandTile PICCADILLY = new LandTile(29, "Piccadilly", 280, 150, YELLOW, 140,
			new int[] { 22, 120, 360, 850, 1025, 1200 });
	// Green
	public final LandTile REGENT = new LandTile(31, "Regent Street", 300, 200, GREEN, 150,
			new int[] { 26, 130, 390, 900, 1100, 1275 });
	public final LandTile OXFORD = new LandTile(32, "Oxford Street", 300, 200, GREEN, 150,
			new int[] { 26, 130, 390, 900, 1100, 1275 });
	public final LandTile BONDSTREET = new LandTile(34, "Bond Street", 320, 200, GREEN, 160,
			new int[] { 28, 150, 450, 1000, 1200, 1400 });
	// Dark Blue
	public final LandTile PARKLANE = new LandTile(37, "Park Lane", 350, 175, DARKBLUE, 200,
			new int[] { 35, 175, 500, 1100, 1300, 1500 });
	public final LandTile MAYFAIR = new LandTile(39, "Mayfair", 400, 200, DARKBLUE, 200,
			new int[] { 50, 200, 600, 1400, 1700, 2000 });
	
	public final Tile[] TILES = new Tile[]
			{
					GO,
					OLDKENT,
					COMMUNITYCHEST1,
					WHITECHAPEL,
					INCOMETAX,
					KINGSCROSS,
					ANGELISLINGTON,
					CHANCE1,
					EUSTON,
					PENTONVILLE,
					JAIL,
					PALLMALL,
					ELECTRICCOMPANY,
					WHITEHALL,
					NORTHUMBERLAND,
					MARYLEBONE,
					BOWSTREET,
					COMMUNITYCHEST2,
					MARLBOROUGH,
					VINESTREET,
					FREEPARKING,
					STRAND,
					CHANCE2,
					FLEETSTREET,
					TRAFALGAR,
					FENCHURCH,
					LEICESTER,
					CONVENTRY,
					WATERWORKS,
					PICCADILLY,
					GOTOJAIL,
					REGENT,
					OXFORD,
					COMMUNITYCHEST3,
					BONDSTREET,
					LIVERPOOL,
					CHANCE3,
					PARKLANE,
					SUPERTAX,
					MAYFAIR
			};
}
