package de.hska.iwi.ads.solution.search;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import de.hska.iwi.ads.search.Search;
import de.hska.iwi.ads.search.SearchTest;

public class BinarySearchTest extends SearchTest {

	@Override
	public <E extends Comparable<E>> Search<E> createSearch() {
		return new BinarySearch<E>();
	}

	@Test
	void testSearchIntArrayInt3() {
		Integer[] a = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2 };
		Search<Integer> search = createSearch();
		assertEquals(9, search.search(a, 2));
	}

	@Test
	void testSearchIntArrayInt4() {
		Integer[] a = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3 };
		Search<Integer> search = createSearch();
		assertEquals(9, search.search(a, 2));
	}

	@Test
	void testSearchIntArrayInt5() {
		Integer[] a = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3 };
		Search<Integer> search = createSearch();
		assertEquals(13, search.search(a, 3));
	}

	@Test
	void testSearchIntArrayInt6() {
		Integer[] a = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3 };
		Search<Integer> search = createSearch();
		assertEquals(12, search.search(a, 3));
	}

	@Test
	void testSearchIntArrayInt7() {
		Integer[] a = { 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3 };
		Search<Integer> search = createSearch();
		assertEquals(1, search.search(a, 2));
	}

	@Test
	void testSearchIntArrayInt8() {
		Integer[] a = { 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 4, 4 };
		Search<Integer> search = createSearch();
		assertEquals(5, search.search(a, 2));
	}
}
