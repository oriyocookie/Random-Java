import java.util.*;
import java.lang.Math;

public class problem2{
    public static void main(String args[]){
	Scanner in=new Scanner(System.in);

	System.out.println("Enter the first coordinates: ");
	double x1=in.nextDouble();
	double y1=in.nextDouble();

	System.out.println("Enter the second coordinates: ");
	double x2=in.nextDouble();
	double y2=in.nextDouble();

	System.out.println("Enter the third coordinates: ");
	double x3=in.nextDouble();
	double y3=in.nextDouble();

	double side1=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
	double side2=Math.sqrt(Math.pow((x3-x2),2)+Math.pow((y3-y2),2));
	double side3=Math.sqrt(Math.pow((x1-x3),2)+Math.pow((y1-y3),2));

	double s=(side1+side2+side3)/2;

	double s1=s-side1;
	double s2=s-side2;
	double s3=s-side3;

	double area2=(s*s1*s2*s3);
	double area=Math.sqrt((area2));

	System.out.println("Area: " + area);
    }

}
