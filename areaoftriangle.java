package areaoftriangle;
import java.util.Scanner;
public class areaoftriangle {

	public static void main(String[] args) {
		
try (Scanner scanner = new Scanner(System.in)) {
	System.out.println("enter the width of the rectangle:");
	double base  = scanner.nextDouble();
	System.out.println("enter the height of the rectangle:");
	double height =scanner.nextDouble();
	double area = (base*height)/2;
	System.out.println("area of triangle:"+area);
}
	}

}
