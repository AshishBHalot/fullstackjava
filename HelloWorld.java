import java.util.Date;
import java.awt.Point;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello Ashish");
		byte age =23; //max size 128 of byte
		long viewCount= 1_112_345_678; // for understandin gand reading use of _
		float price =234.4F;
		char gender='M';
		boolean isValid= true;
		System.out.println(age);
		System.out.println(viewCount);
		System.out.println(gender);
		System.out.println(price);
		System.out.println(isValid);
		
		//non-orimitve type
		String name="King Kong";//syntax looks like primitve type but it is non-primitve types
		System.out.println(name);
		
		Date now=new Date()
;
		System.out.println(now);
		
		Point point1=new Point(10,20);
		Point point2 =point1;
		System.out.println(point1.x+"  "+point1.y);
		System.out.println(point2.x+"  "+point2.y);
		point1.y=25;
		System.out.println(point1.x+"  "+point1.y);
		System.out.println(point2.x+"  "+point2.y);
		
		
	}

}