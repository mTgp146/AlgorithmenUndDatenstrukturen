package de.hska.iwi.ads.solution.generics;

import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;
import de.hska.iwi.ads.generics.Address;
import de.hska.iwi.ads.generics.Pizza;

public class FoodDeliveryServiceTest {

	@Test
	public void TestMethode() {
		FoodDeliveryService<Pizza> d = new FoodDeliveryService<Pizza>();
		// FoodDeliveryService<Pizza> e = new FoodDeliveryService<Pizza>();
		d.addBox(new Cardbox<Pizza>(10, new Pizza("Funghi")), new Address("test1"));
		d.addBox(new Cardbox<Pizza>(20, new Pizza("Salami")), new Address("test2"));
		// e.addBox(new Cardbox<Pizza>(20, new Pizza("Salami")), new Address("test2"));

		d.deliver(new Address("test1"));

		if(d.getFoodBoxes().size() > 1) {
			fail("failed");
		} else if(d.getFoodBoxes().size() < 1) {
			fail("failed");
		}

	}
}
