
public class Triangle extends Figure {
	private final double s1 = 5.0;
	private final double s2 = 3.0;
	private final double s3 = 3.0;

	void findArea() {	//Calculates the Area of the Triangle overloading the method of Abstract Class Figure
		System.out.println("---------------- TRIANGLE ----------------");
		System.out.println("Side 1 : "+s1+" || Side 2 : "+s2+" || Side 3 : "+s3);
		
		// Heron's formula:
		// A = SquareRoot(s * (s - a) * (s - b) * (s - c))
		// where s = (a + b + c) / 2, or 1/2 of the perimeter of the triangle
		double s = (s1 + s2 + s3) / 2;
        dim1= Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));

        System.out.println("Area of Triangle is : " + dim1);
	}

	void findPerimeter() {	//Calculates the Perimeter of the Triangle overloading the method of Abstract Class Figure
		// P = a + b + c
		dim1 = (s1 + s2 + s3);
		System.out.println("Perimeter of Triangle is : " + dim1);
		System.out.println("---------------- TRIANGLE ----------------");		
	}
}