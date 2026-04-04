package Day2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
      //check leap year
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your year : ");
		int year = sc.nextInt();
		
		String result = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
               		?"It is a Leap Year":"Not a Leap Year";
		System.out.println(result);
		
		//cal bonus based on experience
		System.out.print("Enter your Salary : ");
		int sal = sc.nextInt();
		System.out.print("Enter your Experience : ");
		int exp = sc.nextInt();
		float bonus =  exp>=20 ? 0.20f*sal : 0.10f*sal;
		System.out.println(bonus);
		
		//eligiblity to vote 
		
		System.out.print("Enter Your Age : ");
		int age = sc.nextInt();
		System.out.println(age>=18 ? "Can Vote":"Can not Vote");
		
		//check char for upper or lower case
		System.out.print("Enter a Alphabet = ");
		char ch = sc.next().charAt(0);
		String ch1 = (ch>=65 && ch<=90)?"uppercase alphabet "+ch
				:(ch>=97 && ch<=122)
				?"lowercase alphabet "+ch
				:"not a alphabet";
		System.out.println(ch1);
		
		//check +ve or -ve number
		System.out.println("Enter a number : ");
		int i = sc.nextInt();
		String check = i>0 ? "positive value":i<0 ?"negative value":"value is zero";
		System.out.println(check);
		
		//check pass or fail
		System.out.print("Enter your marks : ");
		float marks = sc.nextFloat();
		String status = marks>=40 ? "Pass":"Fail";
		System.out.println(status);
		
		//check vowel
		System.out.print("Enter a alphabet : ");
		char c = sc.next().charAt(0);
		
		String vow = (c=='a'||c=='e'||c=='i'||c=='o'||c=='u')||(c=='A'||c=='E'||c=='I'||c=='O'||c=='U')?"It is a vowel":"not a vowel";
		System.out.println(vow);
		
		//check if aplphabet or not if yes , check for upper or lower case , if uppercase convert to lower case and check for vowels
		System.out.print("Enter a Character : ");
		char a =sc.next().charAt(0);
		
		char a1 = (a>=65 && a<=90)?(char)(a+32):a;
		String a2 = (a1>=97 && a<=122)?(a1=='a'||a1=='e'||a1=='i'||a1=='o'||a1=='u')?a+" is a vowel":a+" is not a vowel":a+" is not a Alphabet ";
		System.out.println(a2);
		
		
//		String alpha = (a>=65 && a<= 90)||(a>=97 && a<=122)?"It's alphabet":"Not a alphabet";
//		System.out.println(alpha);
//		
//		String casee = (a>=65 && a<=90)?"uppercase ":(a>=97 && a<=122)?"lowercase":"not applicable";
//		System.out.println(casee);
//		
//		String convert = (a>=65 && a<=90)?"alphabet = "+(char)(a+32):"character = "+a;
//		System.out.println(convert);
//		
//		String vow = (a=='a'||a=='e'||a=='i'||a=='o'||a=='u')||(a=='A'||a=='E'||a=='I'||a=='O'||a=='U')?"It is a vowel":"not a vowel";
//		System.out.println(vow);
		
	}
}
