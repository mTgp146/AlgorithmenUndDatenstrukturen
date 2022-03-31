package de.hska.iwi.ads.solution.sorting;

import de.hska.iwi.ads.sorting.AbstractMergesort;

public abstract class AMergesort<E extends Comparable<E>> extends AbstractMergesort<E> {
	
	@Override
	protected void mergesort(E[] a, int left, int right) {
		
		if (left < right) {
			int m = (left + right) / 2;	// initialize the middle between left and right
			mergesort(a, left, m);		// divide in half and merge the left side
			mergesort(a, m+1, right);	// divide in half and merge the right side
			merge(a, left, m, right);	// merge the values between left and middle + 1
		}
	}
	
	public void merge(E[] a, int left, int m, int right) {
		
		int l = left;
		int r = m + 1;
		for (int i = left; i <= right; i++) {
			if ((r > right) || ((l <= m) && (a[l].compareTo(a[r]) <= 0)) ) {	// if the left value is less than the right value:
				b[i] = a[l];	// write the left value in b[i]
				l++;
			} else {			// if the right value is less than the left value:
				b[i] = a[r];	// write the right value in b[i]
				r++;
			}
		}
		
		for (int i = left; i <= right; i++) {	// copy b[left..right] in a 
			a[i] = b[i];
		}
	}
	
}
