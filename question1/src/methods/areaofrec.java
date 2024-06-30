package methods;
import java.util.*;
public class areaofrec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		area a1=new area();
		System.out.println("enter your length");
		int l=s1.nextInt();
		System.out.println("enter your breadth");
		int b=s1.nextInt();
		a1.seter(l, b);
		System.out.println("area of rectangle"+a1.get());
	}
}
