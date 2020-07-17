package Circle2D;

public class Circle2D {
	//Two double data fields named x and y that specify the center of the circle with get methods. 
	//A data field radius with a get method.
	private double x; 
	private double y; 
	private double radius;

	//A no-arg constructor that creates a default circle with (0, 0) for (x, y) and 1 for radius
	Circle2D() {
		this(0, 0, 1);
	}

	//A constructor that creates a circle with the specified x, y, and radius
	Circle2D(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double getRadius() {
		return radius;
	}

	//A method getArea() that returns the area of the circle
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}

	//A method getPerimeter() that returns the perimeter of the circle
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}

	//A method contains(double x, double y) that returns true if the specified
	//point (x, y) is inside this circle (a)
	// If the point distance from the circle center is less than the radius, return true.
	public boolean contains(double x, double y) {
		return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2)) < radius;
	}

	//A method contains(Circle2D circle) that returns true if the specified circle
	//is inside this circle(b)
	//Answer:  Add the distance between the two circle centers and the radius of the smaller circle first.
	//if the Sum is smaller than the radius of the larger circle, then there is a smaller circle within the larger circle.
	public boolean contains(Circle2D circle) {
		return Math.sqrt(Math.pow(circle.getX() - x, 2) + Math.pow(circle.getY() - y, 2)) <= Math.abs(radius - circle.getRadius());
	}

	//A method overlaps(Circle2D circle) that returns true if the specified circle
	//overlaps with this circle(c)
	// Answer: If the distance of the center of both circles are closer than the radius of one circle, then they overlap
	public boolean overlaps(Circle2D circle) {
		return Math.sqrt(Math.pow(circle.getX() - x, 2) + Math.pow(circle.getY() - y, 2)) <= radius + circle.getRadius();
	}
	
	
}
