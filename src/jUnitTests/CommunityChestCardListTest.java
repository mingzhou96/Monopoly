package jUnitTests;

import static org.junit.Assert.*;

import org.junit.Test;

import cards.CommunityChestCardList;

public class CommunityChestCardListTest {

	@Test
	public void testDeckComplete() {
		assertEquals(17, CommunityChestCardList.DECK.length);
	}

}
