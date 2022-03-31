package de.hska.iwi.ads.solution.sorting;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;



public class MergesortTest {

	public <E extends Comparable<E>> Mergesort<E> createMergesort() {
		return new Mergesort<E>();
	}
	
	@Test
	void testMergesort1() {
		Integer[] unsorted = { 3, 2, 1};
		Integer[] expected = { 1, 2, 3};
		Mergesort<Integer> mergesort = createMergesort();
		mergesort.sort(unsorted);
		assertArrayEquals( expected, unsorted);
	}
	
	@Test
	void testMergesort2() {
		Integer[] unsorted = { 1};
		Integer[] expected = { 1};
		Mergesort<Integer> mergesort = createMergesort();
		mergesort.sort(unsorted);
		assertArrayEquals( expected, unsorted);
	}
	
	@Test
	void testMergesort3() {
		Integer[] unsorted = { 3, 2, 1, 6, 3, 7, 8, 5};
		Integer[] expected = { 1, 2, 3, 3, 5, 6, 7, 8};
		Mergesort<Integer> mergesort = createMergesort();
		mergesort.sort(unsorted);
		assertArrayEquals( expected, unsorted);
	}
	
	@Test
	void testMergesort4() {
		Integer[] unsorted = { 3, 2, 1, 1, 1, 1, 1};
		Integer[] expected = { 1, 1, 1, 1, 1, 2, 3};
		Mergesort<Integer> mergesort = createMergesort();
		mergesort.sort(unsorted);
		assertArrayEquals( expected, unsorted);
	}
	
	
	
}
