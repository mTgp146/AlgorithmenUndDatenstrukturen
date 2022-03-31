package de.hska.iwi.ads.solution.sorting;

import de.hska.iwi.ads.sorting.Reverse;

public class ReverseArray<E extends Comparable<E>> implements Reverse<E> {
	
	@Override
	public void reverse(E[] a, int from, int to) {
		
		E [] b = a.clone();
		
		for (int i = from; i <= to; i++) {
			b[i] = a[i];
		}
		
		for (int i = from; i <= to; i++) {
			a[i] = b[to - (i - from)];
		}
	}
}
