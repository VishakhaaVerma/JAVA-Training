package Day3;

import java.util.Scanner;

public class CheckNbit {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        System.out.print("Enter nth bit position: ");
        int n = sc.nextInt();

        
        int bitStatus = (num >> n) & 1;

       
        if (bitStatus == 1) {
            System.out.println("The " + n + "th bit is SET (1)");
        } else {
            System.out.println("The " + n + "th bit is NOT SET (0)");
        } 
        sc.close(); 

	}

}
