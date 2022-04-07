package de.hska.iwi.ads.solution.sorting;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

public class ReverseArrayTest {

	public <E extends Comparable<E>> ReverseArray<E> createReverseArray() {
		return new ReverseArray<E>();
	}
	
	@Test
	void testReverseArray0() {
		Integer[] unreversed = { 3, 2, 1};
		Integer[] expected   = { 1, 2, 3};
		ReverseArray<Integer> reverseArray = createReverseArray();
		reverseArray.reverse(unreversed, 0, 2);
		assertArrayEquals( expected, unreversed);	
	}
	
	@Test
	void testReverseArray1() {
		Integer[] unreversed = { 3, 2, 1};
		Integer[] expected   = { 3, 1, 2};
		ReverseArray<Integer> reverseArray = createReverseArray();
		reverseArray.reverse(unreversed, 1, 2);
		assertArrayEquals( expected, unreversed);	
	}
	
	@Test
	void testReverseArray2() {
		Integer[] unreversed = { 3, 2, 1, 1, 5, 6};
		Integer[] expected   = { 1, 1, 2, 3, 5, 6};
		ReverseArray<Integer> reverseArray = createReverseArray();
		reverseArray.reverse(unreversed, 0, 3);
		assertArrayEquals( expected, unreversed);	
	}
	
	@Test
	void testReverseArray3() {
		Integer[] unreversed = { 2, 1};
		Integer[] expected   = { 1, 2};
		ReverseArray<Integer> reverseArray = createReverseArray();
		reverseArray.reverse(unreversed, 0, 1);
		assertArrayEquals( expected, unreversed);	
	}
	
	@Test
	void testReverseArray4() {
		String[] unreversed = { "a", "b"};
		String[] expected   = { "b", "a"};
		ReverseArray<String> reverseArray = createReverseArray();
		reverseArray.reverse(unreversed, 0, 1);
		assertArrayEquals( expected, unreversed);	
	}
	
	@Test
	void testReverseArray5() {
		Integer[] unreversed = { 2, 1};
		Integer[] expected   = { 2, 1};
		ReverseArray<Integer> reverseArray = createReverseArray();
		reverseArray.reverse(unreversed, 0, 0);
		assertArrayEquals( expected, unreversed);	
	}
	
}
