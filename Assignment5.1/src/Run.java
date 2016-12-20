//Display the area and perimeter of 3 Figures (Circle, Rectangle and Triangle) and print the details for all.
public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create an instance of the Class Circle
		Figure c=new Circle();
		c.findArea();
		c.findPerimeter();

		//Create an instance of the Class Rectangle
		Figure r=new Rectangle();
		r.findArea();
		r.findPerimeter();		
		
		//Create an instance of the Class Triangle
		Figure t=new Triangle();
		t.findArea();
		t.findPerimeter();	
	}
}
