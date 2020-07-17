/*

In an n-sided regular polygon, all sides have the same length and all angles have the same degree. Design a class named RegularPolygon that contains: 

    A private int data field named n that defines the number of sides in the polygon with default value 3
    A private double data field named side that stores the length of the side with default value 1
     A private double data field named x that defines the x-coordinate of the polygon’s center with default value 0.
     A private double data field named y that defines the y-coordinate of the polygon’s center with default value 0.
     A no-arg constructor that creates a regular polygon with default values.
     A constructor that creates a regular polygon with the specified number of side and length of side, centered at (0, 0).
     A constructor that creates a regular polygon with the specified number of sides, length of side, and x- and y-coordinates.
     The accessor and mutator methods for all data fields.
     The method getPerimeter() that returns the perimeter of the polygon.
     The method getArea() that returns the area of the polygon. Use the following formula to :


Name :Tenzin Shedup

Student ID: 120664180

If any part of your code does not have a comment in each section of your code and does not include the above declarations, you will receive 0 for the whole midterm. 

 * */
public class Polygon {
	
	    public static void main(String[] args) 
	    {
	    	Polygon poly1 = new Polygon();//creates instance of polygon
	        System.out.println("the area is: " + poly1.getArea());//calls method to get area
	        System.out.println(" the perimeter is " + poly1.getPerimeter());//calls method to get perimeter
	        
	       Polygon poly2 = new Polygon(6, 4);//creates instance of polygon with two parameters
	        System.out.println("the area is: " + poly2.getArea());//calls method to get area
	        System.out.println(" the perimeter is " + poly2.getPerimeter());//calls method to get perimeter

	        Polygon poly3 = new Polygon(10, 4, 5.6, 7.8);//creates instance of polygon with three parameters
	        System.out.println("the area is: " + poly3.getArea());//calls method to get area
	        System.out.println(" the perimeter is " + poly3.getPerimeter());//calls method to get perimeter
	    }
	
	    private int numOfSides; //number of sides of the polygon
	    private double sideLength; //store the length of the side
	    private double x; // x coordinate
	    private double y; //y coordinate

	    Polygon()//non arg constructor 
	    {
	        numOfSides = 3;
	        sideLength = 1;
	        x = 0; 
	        y = 0;
	    }

	    Polygon(int numOfSides, double sideLength)//constructor with 2 parameters 
	    {
	        this.numOfSides = numOfSides;
	        this.sideLength = sideLength;
	        x = 0;
	        y = 0;
	    }

	    Polygon(int numOfSides, double sideLength, double x, double y)//constructor with 4 parameters 
	    {
	        this.numOfSides = numOfSides;
	        this.sideLength = sideLength;
	        this.x = x;
	        this.y = y;
	    }

	    public void setN(int then)//sets number of sides
	    {
	    	numOfSides = then;
	    }

	    public int getN()//gets number of sides
	    {
	        return numOfSides;
	    }

	    public void setSide(double theside)//set the side length
	    {
	    	sideLength = theside;
	    }

	    public double getSide()//gets the slide length
	    {
	        return sideLength;
	    }

	    public void setX(int thex)//sets the X
	    {
	        x = thex;
	    }

	    public double getX()//gets the x
	    {
	        return x;
	    }

	    public void setY(int they)//sets the y
	    {
	        y = they;
	    }

	    public double getY()//gets the y
	    {
	        return y;
	    }

	    public double getPerimeter()//get the the perimeter by multiply the number of slides by the sidelength
	    {
	        return numOfSides * sideLength;
	    }

	    public double getArea()//gets the area, formula provided
	    {
	        return (numOfSides * (sideLength * sideLength)) / (4.0 * Math.tan(Math.PI / numOfSides));
	    }
	}



