package Circle2D;

public class Main {
	public static void main(String[] args) {
		// Create a Circle2D object
		Circle2D circle = new Circle2D(3, 3, 12);

		// Display results
		System.out.println("Circle area: " + circle.getArea()); 
		
		System.out.println("Circle perimeter: " + circle.getPerimeter()); 
		
		System.out.println("Is (0,0) located in circle? " + circle.contains(0, 0)); 
		
		System.out.println("Does circle1 contain circle2? " + circle.contains(new Circle2D(5, 5, 5)));
		
		System.out.println("Does circle1 overlap with circle2? " + circle.overlaps(new Circle2D(3, 5, 2.3)));
	}

}
