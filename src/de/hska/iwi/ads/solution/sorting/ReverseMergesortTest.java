package de.hska.iwi.ads.solution.sorting;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class ReverseMergesortTest {

	public <E extends Comparable<E>> ReverseMergesort<E> createReverseMergesort() {
		return new ReverseMergesort<E>();
	}
	
	@Test
	void testReverseMergesort1() {
		Integer[] unsorted = { 5, 4, 3, 2, 1};
		Integer[] expected = { 5, 4, 3, 2, 1};
		ReverseMergesort<Integer> reverseMergesort = createReverseMergesort();
		reverseMergesort.reverseMergesort(unsorted, 1, 4);
		assertArrayEquals( expected, unsorted);
	}
	
	@Test
	void testReverseMergesort2() {
		Integer[] unsorted = { 7, 4, 3, 2, 8, 1, 9, 7};
		Integer[] expected = { 7, 9, 8, 4, 3, 2, 1, 7};
		ReverseMergesort<Integer> reverseMergesort = createReverseMergesort();
		reverseMergesort.reverseMergesort(unsorted, 1, 6);
		assertArrayEquals( expected, unsorted);
	}
	
	@Test
	void testReverseMergesort3() {
		Integer[] unsorted = { 7, 4, 3, 2, 8, 1, 9, 7, 10, 11, 1};
		Integer[] expected = { 7, 4, 10, 9, 8, 7, 3, 2, 1, 11, 1};
		ReverseMergesort<Integer> reverseMergesort = createReverseMergesort();
		reverseMergesort.reverseMergesort(unsorted, 2, 8);
		assertArrayEquals( expected, unsorted);
	}
	
	@Test
	void testReverseMergesort4() {
		Integer[] unsorted = { 3, 2, 5, 1, 4};
		Integer[] expected = { 5, 4, 3, 2, 1};
		ReverseMergesort<Integer> reverseMergesort = createReverseMergesort();
		reverseMergesort.reverseMergesort(unsorted, 0, 4);
		assertArrayEquals( expected, unsorted);
	}
}
