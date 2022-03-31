package de.hska.iwi.ads.solution.interfaces;
import de.hska.iwi.ads.interfaces.AbstractCircle;
import de.hska.iwi.ads.interfaces.Vector;

public class Circle extends AbstractCircle {

	public Circle(Vector middlePoint, double radius) {
		super(middlePoint, radius);
	}
	
	public Circle(double radius) {
		super(radius);
		if(radius < 0) {
			throw new IllegalArgumentException("negative radius not allowed: " + radius);
		}
	}
	
	public void scale(double factor) {
		if(factor >= 0) {
			radius *= factor;
		}
	}
	
	public double area() {
		return Math.pow(radius, 2) * Math.PI;
	}
	
	public double getDimension() {
		return radius;
	}
	
	
	
	
	
	
	
	
}
