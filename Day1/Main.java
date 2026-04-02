package Day1;

public class Main {


	public static void main(String[] args) {
		 //area of rectangle
		int len = 2;
		int bre = 3;
		System.out.println("Area of the rectangle with sides 2 and 3 = "+(len*bre));
		
		
		//area of circle
		int rad = 5;
		float pi = 3.14f;
		System.out.println("Area of circle with radius 5 = "+(pi*rad*rad));
		
		
		//print ascii value of "h"
		char ch ='h';
		int ch1 = (int)ch;
		System.out.println("ASCII Value of character 'h' is "+ch1);
		
		//add 3 to ascii vale of 'd' and print character
		char ch3 = 'd';
		int ch4 = (int)ch3 +3;
		char ch5 = (char)ch4;
		System.out.println("3+ character 'd' is '"+ch5+"'");
		
		//add int and double 
		int a = 5;
		double b = 6.2;
		System.out.println("sum of 5 and 6.2 = "+(double)(a+b));
		
		//square of float
		float f1=3.9f;
		System.out.println("Square of 3.9 = "+(float)(f1*f1));
		
		//convert double to int
		double d1 = 100.235;
		int i1 = (int)d1;
		System.out.println("Value of double variable in int ="+i1);
		
		//print int ,double and char
		int i = 60;
		double d =45.897;
		char c ='K';
		System.out.println("Integer = "+i+ " , Double = "+d +" , Charcter = "+c);

	}

}