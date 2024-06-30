package geometry;
import java.util.*;

public class maindemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner s1=new Scanner(System.in);
		circle a1=new circle();
		rectangle a2=new rectangle();
		triangle a3=new triangle();
		System.out.println("enter radius of circle");
		a=s1.nextInt();
		System.out.println(" area of circle is "+a1.area(a));
		System.out.println(" perimeter of circle is "+a1.perimeter(a));
		System.out.println("enter  2 side and base  of triangle");
		a=s1.nextInt();
		b=s1.nextInt();
		c=s1.nextInt();
		System.out.println(" area of triangle is "+a3.area(b,c));
		System.out.println(" perimeter of triangle is "+a3.perimeter(a,b,c));
		System.out.println("enter length  and width of rectangle");
		a=s1.nextInt();
		b=s1.nextInt();
		System.out.println(" area of rectangle is "+a2.area(a,b));
		System.out.println(" perimeter of rectangle is "+a2.perimeter(a,b));
		
		

	}

}
