package Day3;

 import java.util.Scanner;
class Bank{
	double amount;
	 public Bank(double amount)
	 {
		 this.amount =amount;
	 }
	
	  void withdrawalAmount(double withdrawalAmount) {
		String mssg = (withdrawalAmount <= amount)?" Amount Withdrawal Successfully!!":"Insufficient Balance!!";
		
		System.out.println(mssg);
		
		amount = (withdrawalAmount <= amount)?(amount - withdrawalAmount) : amount;
	 }
	
	  void depositAmount(double deposit) {
		 amount += deposit;
		 System.out.println("Amount Deposited successfully!!");
		 
	 }
	 
	  void displayBalance() {
		  System.out.println("Total Amount : "+amount);
	  }
	 
	  
}

public class BankingSystem {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	       
	        System.out.print("Enter initial amount: ");
	        double initialAmount = sc.nextDouble();

	        Bank account = new Bank(initialAmount);

	        System.out.print("Enter withdrawal amount: ");
	        double withdrawalAmount = sc.nextDouble();
	        account.withdrawalAmount(withdrawalAmount);

	        account.displayBalance();
	        
	        System.out.print("Enter deposit amount: ");
	        double depositAmount = sc.nextDouble();
	        account.depositAmount(depositAmount);

	        account.displayBalance();

	}

}
