package de.hska.iwi.ads.solution.interfaces;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;
import de.hska.iwi.ads.interfaces.Vector;
import de.hska.iwi.ads.interfaces.VectorTest;

public class CartesianVectorTest extends VectorTest {

	@Override
	public Vector createVector(double x, double y) {
		CartesianVector vectorTest = new CartesianVector(x,y);
		return vectorTest;
	}
	
	@Test
	public void VectorTest() {
		Vector v = createVector(1, 0);
		assertEquals(v.getDirection(), 0);
	}

	
	
}
