package de.hska.iwi.ads.solution.sorting;

public class ReverseMergesort<E extends Comparable<E>> extends AMergesort<E> {

	protected void reverseMergesort(E[] a, int left, int right) {
		b = a.clone();
		int m = ((left + right) /2);	// Initialize the middle between left and right
		mergesort(a, left, right);	// Mergesort a
		ReverseArray<E> reverseArray = new ReverseArray<>(); // Initialize reverseArray
		reverseArray.reverse(a, m+1, right);	// reverse right side between left and right
		mergeReversedArray(a, left, right, m);
	}

	private void mergeReversedArray(E[] a, int left, int right, int middle) {	// Merge left..middle in middle+1..right
		
		for(int i = middle; i >= left; i--) {	// move values middle..left one by one to the right until the next value is bigger or the value is at right
			for(int j = i; (j < right)&&(a[j].compareTo(a[j+1]) <= 0); j++) {
				E temp = a[j+1];
				a[j+1] = a[j];
				a[j] = temp;
			}
		}
	}
}
