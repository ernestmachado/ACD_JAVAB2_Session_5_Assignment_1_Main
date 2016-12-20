
public class Rectangle extends Figure {
	private final double length = 5.0;
	private final double width = 2.0;

	void findArea() {	//Calculates the Area of the Rectangle overloading the method of Abstract Class Figure
		System.out.println("---------------- RECTANGLE ----------------");
		System.out.println("Length : "+length+" || Width : "+width);
		// A = L x W
		dim1 = length*width;
		System.out.println("Area of Rectangle is : " + dim1);
	}

	void findPerimeter() {	//Calculates the Perimeter of the Rectangle overloading the method of Abstract Class Figure
		// P = 2 x ( L + W)
		dim1 = 2 * (length+width);
		System.out.println("Perimeter of Rectangle is : " + dim1);
		System.out.println("---------------- RECTANGLE ----------------");
	}
}
