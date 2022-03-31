package de.hska.iwi.ads.solution.search;

import de.hska.iwi.ads.search.Search;

public class BinarySearch<E extends Comparable<E>> implements Search<E> {

	@Override
	public int search(E[] a, E key, int left, int right) {
		int e = 0;
		if (key.compareTo(a[left]) < 0) {
			e = left - 1;
		} else if (key.compareTo(a[right]) > 0) {
			e = right + 1;
		} else {
			
			if (key.compareTo(a[right]) == 0) {			// most right Wert zurückgeben, wenn dieser den Wert des Keys beinhaltet
				e = right;
			} else {
				e = searchPlaceForKey(a, key, left, right);	
			}
			
			if (e > 0) {
				if (key.compareTo(a[e - 1]) == 0) {		// Most left Wert herausfinden, falls es doppelte Key-Werte gibt.
					e = bringResultToLeft(a, key, left, e);
				}
			}
		}
		return e;
	}

	private int bringResultToLeft(E[] a, E key, int left, int right) {	// Rekursive Methode zum herausfinden des most left Wertes
		
		int middle = halfInterval(a, left, right);

		if (middle == 0) {
			if (a[middle+1].compareTo(a[middle]) > 0) {
				return 1;
			} else {
				return middle;
			}
		} else if (key.compareTo(a[middle]) == 0) {
			return bringResultToLeft(a, key, left, middle);
		} else if (key.compareTo(a[right-1]) == 0) {
			return bringResultToLeft(a, key, middle, right);
		} else {
			return middle +1;
		}
	}

	private int searchPlaceForKey(E[] a, E key, int left, int right) {	// Rekursive Methode zum herausfinden, ob und welcher Wert in a dem key entspricht

		int middle = halfInterval(a, left, right);
		if (key.compareTo(a[middle]) > 0) {				// Die Methode mit der rechten Hälfte aufrufen, wenn der mittlere Wert kleiner als der Key ist
			return searchPlaceForKey(a, key, middle, right);
		} else if (key.compareTo(a[middle - 1]) < 0) {	// Die Methode mit der linken Hälfte aufrufen, wenn der Wert links von der Mitte größer als der Key ist
			return searchPlaceForKey(a, key, left, middle);
		} else if (key.compareTo(a[middle - 1]) == 0) {	// Den Wert links von der Mitte zurückgeben, wenn er dem Key entspricht
			return middle - 1;
		} else {
			return middle;
		}
	}

	private int halfInterval(E[] a, int left, int right) {	// Intervall zwischen left und right halbieren
		int intervalSize = right - left;
		return left + (intervalSize / 2);
	}
}
