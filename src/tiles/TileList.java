package tiles;

/*
 * List of tiles contained in Monopoly
 */
public final class TileList {

	//Special Effect Tiles
	//Go
	public static final SpecialEffectTile GO = new SpecialEffectTile(0, "Go") {
		@Override
		public void onTrigger() {
			//Collect 200$
			System.err.println("Collect 200$");
		}
	};
	
	//Jail
	public static final SpecialEffectTile JAIL = new SpecialEffectTile(10, "Jail") {
		
		@Override
		public void onTrigger() {
			System.err.println("No effect");
		}
	};
	
	//Free Parking
	public static final SpecialEffectTile FREEPARKING = new SpecialEffectTile(20, "Free Parking") {
		
		@Override
		public void onTrigger() {
			System.err.println("No effect");
		}
	};
	
	//Go To Jail
	public static final SpecialEffectTile GOTOJAIL = new SpecialEffectTile(30, "Go To Jail") {
		
		@Override
		public void onTrigger() {
			System.err.println("Go to jail");
		}
	};
	
	//Community Chests
	public static final CommunityChestTile COMMUNITYCHEST1 = new CommunityChestTile(2);
	public static final CommunityChestTile COMMUNITYCHEST2 = new CommunityChestTile(17);
	public static final CommunityChestTile COMMUNITYCHEST3 = new CommunityChestTile(33);
	
	//Chances
	public static final ChanceTile CHANCE1 = new ChanceTile(7);
	public static final ChanceTile CHANCE2 = new ChanceTile(22);
	public static final ChanceTile CHANCE3 = new ChanceTile(36);
	
	//Income Tax
	public static final TaxTile INCOMETAX = new TaxTile(4, "Income Tax", 200);
	public static final TaxTile SUPERTAX = new TaxTile(38, "Super Tax", 100);
	
	// Color Groups
	public static final String BROWN = "Brown";
	public static final String LIGHTBLUE = "Light Blue";
	public static final String PINK = "Pink";
	public static final String ORANGE = "Orange";
	public static final String RED = "Red";
	public static final String YELLOW = "Yellow";
	public static final String GREEN = "Green";
	public static final String DARKBLUE = "Dark Blue";

	// Ownable Tiles

	// Utility Tiles
	public static final UtilityTile ELECTRICCOMPANY = new UtilityTile(12, "Electric Company", 150, 75);
	public static final UtilityTile WATERWORKS = new UtilityTile(28, "Water Works", 150, 75);
	// Station Tiles
	public static final StationTile KINGSCROSS = new StationTile(5, "King's Cross Station", 200, 100);
	public static final StationTile MARYLEBONE = new StationTile(15, "Marylebone Station", 200, 100);
	public static final StationTile FENCHURCH = new StationTile(25, "Fenchurch St Station", 200, 100);
	public static final StationTile LIVERPOOL = new StationTile(35, "Liverpool Street Station", 200, 100);
	// Land Tiles
	// Brown
	public static final LandTile OLDKENT = new LandTile(1, "Old Kent Road", 60, 50, BROWN, 30,
			new int[] { 2, 10, 30, 90, 160, 250 });
	public static final LandTile WHITECHAPEL = new LandTile(3, "Whitechapel Road", 60, 50, BROWN, 30,
			new int[] { 4, 20, 60, 180, 360, 450 });
	// Light Blue
	public static final LandTile ANGELISLINGTON = new LandTile(6, "The Angel Islington", 100, 50, LIGHTBLUE, 50,
			new int[] { 6, 30, 90, 270, 400, 550 });
	public static final LandTile EUSTON = new LandTile(8, "Euston Road", 100, 50, LIGHTBLUE, 50,
			new int[] { 6, 30, 90, 270, 400, 550 });
	public static final LandTile PENTONVILLE = new LandTile(9, "Pentonville Road", 120, 60, LIGHTBLUE, 50,
			new int[] { 8, 40, 100, 300, 450, 600 });
	// Pink
	public static final LandTile PALLMALL = new LandTile(11, "Pall Mall", 140, 70, PINK, 100,
			new int[] { 10, 50, 150, 450, 625, 750 });
	public static final LandTile WHITEHALL = new LandTile(13, "Whitehall", 140, 70, PINK, 100,
			new int[] { 10, 50, 150, 450, 625, 750 });
	public static final LandTile NORTHUMBERLAND = new LandTile(14, "Northumberland Avenue", 160, 80, PINK, 100,
			new int[] { 12, 60, 180, 500, 700, 900 });
	// Orange
	public static final LandTile BOWSTREET = new LandTile(16, "Bow Street", 180, 90, ORANGE, 100,
			new int[] { 14, 70, 200, 550, 750, 950 });
	public static final LandTile MARLBOROUGH = new LandTile(18, "Marlborough Street", 180, 90, ORANGE, 100,
			new int[] { 14, 70, 200, 550, 750, 950 });
	public static final LandTile VINESTREET = new LandTile(19, "Vine Street", 200, 100, ORANGE, 100,
			new int[] { 16, 80, 220, 600, 800, 1000 });
	// Red
	public static final LandTile STRAND = new LandTile(21, "Strand", 220, 110, RED, 150,
			new int[] { 18, 90, 250, 700, 875, 1050 });
	public static final LandTile FLEETSTREET = new LandTile(23, "Fleet Street", 220, 110, RED, 150,
			new int[] { 18, 90, 250, 700, 875, 1050 });
	public static final LandTile TRAFALGAR = new LandTile(24, "Trafalgar Square", 240, 120, RED, 150,
			new int[] { 20, 100, 300, 750, 925, 1100 });
	// Yellow
	public static final LandTile LEICESTER = new LandTile(26, "Leicester Square", 260, 150, YELLOW, 150,
			new int[] { 22, 110, 330, 800, 975, 1150 });
	public static final LandTile CONVENTRY = new LandTile(27, "Conventry Street", 260, 150, YELLOW, 150,
			new int[] { 22, 110, 330, 800, 975, 1150 });
	public static final LandTile PICCADILLY = new LandTile(29, "Piccadilly", 280, 150, YELLOW, 140,
			new int[] { 22, 120, 360, 850, 1025, 1200 });
	// Green
	public static final LandTile REGENT = new LandTile(31, "Regent Street", 300, 200, GREEN, 150,
			new int[] { 26, 130, 390, 900, 1100, 1275 });
	public static final LandTile OXFORD = new LandTile(32, "Oxford Street", 300, 200, GREEN, 150,
			new int[] { 26, 130, 390, 900, 1100, 1275 });
	public static final LandTile BONDSTREET = new LandTile(34, "Bond Street", 320, 200, GREEN, 160,
			new int[] { 28, 150, 450, 1000, 1200, 1400 });
	// Dark Blue
	public static final LandTile PARKLANE = new LandTile(37, "Park Lane", 350, 175, DARKBLUE, 200,
			new int[] { 35, 175, 500, 1100, 1300, 1500 });
	public static final LandTile MAYFAIR = new LandTile(39, "Mayfair", 400, 200, DARKBLUE, 200,
			new int[] { 50, 200, 600, 1400, 1700, 2000 });
	
	public static final Tile[] TILES = new Tile[]
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
