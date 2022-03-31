package de.hska.iwi.ads.solution.generics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class CardboxTest {
	
	@Test
	public void CardboxTest1() {
		Cardbox<String> c = new Cardbox<String>(10, "Test");
		Cardbox<String> d = new Cardbox<String>(20, "Test");
		assertEquals(c.compareTo(d),-2);
		assertEquals(d.compareTo(c), 2);
	}
}
