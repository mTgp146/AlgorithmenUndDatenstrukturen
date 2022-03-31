package de.hska.iwi.ads.solution.generics;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import de.hska.iwi.ads.generics.AbstractDeliveryService;
import de.hska.iwi.ads.generics.Address;
import de.hska.iwi.ads.generics.Box;

public class FoodDeliveryService<T> extends AbstractDeliveryService<T> {

	@Override
	public Map<Box<T>, Address> getFoodBoxes() {
		return stackOfFoodBoxes;
	}

	@Override
	public Set<Box<T>> deliver(Address address) {

		Set<Box<T>> foodBoxes = new HashSet<>();
		Map<Box<T>, Address> needsToBeRemoved = new HashMap<>();

		for (Entry<Box<T>, Address> i : stackOfFoodBoxes.entrySet()) {
			if (address.equals(i.getValue())) {
				foodBoxes.add(i.getKey());
				needsToBeRemoved.put(i.getKey(), i.getValue());
			}
		}
		needsToBeRemoved.forEach(stackOfFoodBoxes::remove);
		return foodBoxes;
	}

}
