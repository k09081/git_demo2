package generics;
import java.util.*;
public class GenericsRunner {

	public static void main(String[] args) {

		//program to find max of three number using inbuilt functions
		
		Scanner sc=new Scanner(System.in);
		
	System.out.println("Enter first number");
	int a=sc.nextInt();
	System.out.println("Enter second number");
	int b=sc.nextInt();
	System.out.println("Enter third number");
	int c=sc.nextInt();
	
	int result=Math.max(a, Math.max(b, c));
	
	System.out.println("maximum of  three number"+result);
	
	


	}

}
