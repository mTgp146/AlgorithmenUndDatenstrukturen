package de.hska.iwi.ads.solution.sorting;

import de.hska.iwi.ads.sorting.Reverse;

public class ReverseArray<E extends Comparable<E>> implements Reverse<E> {
	
/*	@Override
	public void reverse(E[] a, int from, int to) {
		
		E [] b = a.clone();
		
		for (int i = from; i <= to; i++) {	// move values from b reversed in a
			a[i] = b[to - (i - from)];
		}
	}	*/
	
	@Override
	public void reverse(E[] a, int from, int to) {
		
		E  b;
		
		for (int i = from; i <= (to+from)/2; i++) {	// reverse values in a between from and to
			b = a[i];
			a[i] = a[to - (i - from)];
			a[to - (i - from)] = b;
		}
	}
	
}
