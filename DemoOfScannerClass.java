import java.util.Scanner;
public class DemoOfScannerClass 
{
	public static void main(String[] args) 
	{
	// lets create object of scanner class to get
	// data from keyboard
	Scanner sc = new Scanner(System.in);	
	Scanner sc2 = new Scanner(System.in);	
	
	System.out.print("Input int value: ");
	
	int i = sc.nextInt();
	
	System.out.println(i);
	
	System.out.print("Input float value: ");
	
	float f = sc.nextFloat();
	
	System.out.println(f);
	
	System.out.print("Enter a string without spaces: ");
	
	String s1 = sc.next();
	
	System.out.println(s1);
	
	System.out.print("Enter a string with spaces: ");
	
	String s2 = sc2.nextLine();
	
	System.out.println(s2);
	
	}
}







































