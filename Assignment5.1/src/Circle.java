//This is the Circle class inherited from the Figure class
public class Circle extends Figure {
	private final double radius = 5.0;
	
	void findArea() {		//Calculates the Area of the Circle overloading the method of Abstract Class Figure
		System.out.println("---------------- CIRCLE ----------------");
		System.out.println("Radius : "+radius);
		// A = π r^2
		dim1 = Math.PI * Math.pow(radius, 2);
		System.out.println("Area of Circle is : " + dim1);
	}

	void findPerimeter() {  //Calculates the Perimeter of the Circle overloading the method of Abstract Class Figure
		// P = 2πr
		dim1 = 2 * Math.PI * radius;
		System.out.println("Perimeter of Circle is : " + dim1);
		System.out.println("---------------- CIRCLE ----------------");
	}
}
