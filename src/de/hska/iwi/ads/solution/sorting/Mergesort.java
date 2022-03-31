package de.hska.iwi.ads.solution.sorting;

import de.hska.iwi.ads.sorting.AbstractMergesort;

public class Mergesort<E extends Comparable<E>> extends AbstractMergesort<E> {

	@Override
	protected void mergesort(E[] a, int left, int right) {
		
		if (left < right) {
			int m = (left + right) / 2;
			mergesort(a, left, m);
			mergesort(a, m+1, right);
			merge(a, left, m, right);
		}
	}
	
	public void merge(E[] a, int left, int m, int right) {
	
		int l = left;
		int r = m + 1;
		for (int i = left; i <= right; i++) {
			if ((r > right) || ((l <= m) && (a[l].compareTo(a[r]) <= 0)) ) {
				b[i] = a[l];
				l++;
			} else {
				b[i] = a[r];
				r++;
			}
		}
		
		for (int i = left; i <= right; i++) {
			a[i] = b[i];
		}
	}
}








