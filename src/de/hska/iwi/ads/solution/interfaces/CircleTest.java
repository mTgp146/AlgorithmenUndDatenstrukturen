package de.hska.iwi.ads.solution.interfaces;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * A few simple tests for Circle.
 * 
 * Use {@link Circle#Circle(double)} to create a Circle instance.
 */
class CircleTest {

  /**
   * Create a Circle with a negative radius -10.0.
   * Check with a try-catch-statement 
   * that the constructor throws an IllegalArgumentException.
   */
  @Test
  void testCircleDouble() {
    try {
    	new Circle(-10.0);
    	fail("Does not throw IllegalArgumentException");
    } catch(IllegalArgumentException e) {
    }
  }
  
  /*
   * Create a Circle with radius 1.5.
   * Scale it by a factor of 2.0.
   * Check that afterwards the Circle 
   * has a radius near 3.0.
   */
  @Test
  void testScale1() {
    Circle testScaleCircle = new Circle(1.5);
    testScaleCircle.scale(2.0);
    assertEquals(testScaleCircle.getDimension(), 3.0);
  }
  
  @Test
  void testScale2() {
	    Circle testScaleCircle = new Circle(1.5);
	    testScaleCircle.scale(-2.0);
	    assertEquals(testScaleCircle.getDimension(), 1.5);
	  }
  
  @Test
  void testScale3() {
	    Circle testScaleCircle = new Circle(2.0);
	    testScaleCircle.scale(0.5);
	    assertEquals(testScaleCircle.getDimension(), 1.0);
	  }

  /*
   * Create a Circle with radius 1.0.
   * Check that the area is nearly Math.PI.
   */
  @Test
  void testArea1() {
    Circle testArea1Circle = new Circle(1.0);
    assertEquals(testArea1Circle.area(), Math.PI, 0.00000001);
  }

  /*
   * Create a Circle with radius 2.0.
   * Check that the area is nearly 4.0 * Math.PI.
   */
  @Test
  void testArea2() {
	  Circle testArea2Circle = new Circle(2.0);
	    assertEquals(testArea2Circle.area(), 4.0*Math.PI, 0.0000001);
  }


  /*
   * Create a Circle with radius 1.0.
   * Check that the radius is near 1.0.
   */
  @Test
  void testGetRadius1() {
    Circle testGetRadiusCircle = new Circle(1.0);
    assertEquals(testGetRadiusCircle.getDimension(), 1.0, 0.0000001);
  }

}
