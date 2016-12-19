package jUnitTests;

import static org.junit.Assert.*;

import org.junit.Test;

import cards.ChanceCardList;

public class ChanceCardListTest {

	@Test
	public void testDeckComplete() {
		assertEquals(17, ChanceCardList.DECK.length);
	}

}
