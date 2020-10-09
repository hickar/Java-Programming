package Circle;

public class Circle {
	private double radius = 1;
	private String color = "white";
	private boolean filled = false;

	public Circle() {};

	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}

	public Circle(double radius, String color, boolean filled) {
		this.radius = radius;
		this.color = color;
		this.filled = filled;
	}

	public double radius() {
		return radius;
	}

	public void radius(double radius) {
		this.radius = radius;
	}

	public double area() {
		return Math.PI * Math.pow(radius, 2);
	}

	public double perimeter() {
		return 2 * Math.PI * radius;
	}

	@Override
	public String toString() {
		return "radius: " + radius + ", color: " + color + ", filled: " + filled;
	}
}

