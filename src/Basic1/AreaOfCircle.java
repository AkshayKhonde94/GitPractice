package Basic1;

public class AreaOfCircle {

	public static void main(String[] args) {
		int radius_of_circle = 7;
		/*  Radius of Circle            */
		double area = Math.PI * radius_of_circle * radius_of_circle;
		System.out.println(area);
		
		/*  Perimeter of Circle            */
		double perimeter = 2 *Math.PI * radius_of_circle;
		System.out.println(perimeter);
	}

}
