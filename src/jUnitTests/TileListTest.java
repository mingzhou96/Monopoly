package jUnitTests;

import static org.junit.Assert.*;

import org.junit.Test;

import tiles.TileList;

public class TileListTest {

	@Test
	public void testTileComplete() {
		assertEquals(40, TileList.TILES.length);
	}

	@Test
	public void testIndexCorrect(){
		for(int i = 0; i < 40; i++){
			assertEquals(i, TileList.TILES[i].getBoardIndex());
		}
	}
}
