package com.leeroy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AdditionTest {
	@Test
	public void testAddition() {
		assertEquals(12, Addition.add(5, 7));
	}
}

