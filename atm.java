import java.util.Scanner;
public class atm
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter your ATM PIN:");
	    int pin=sc.nextInt();
	    System.out.println("Enter Number 1-withdraw/nNumber 2-deposit/nNumber 3-balance");
	    int num=sc.nextInt();
	    switch(num){
	        case 1:
	            System.out.println("Enter withdraw amount:");
	            int a=sc.nextInt();
	            System.out.println(a +"is withdraw sucessfully");
	            break;
	       case 2:
	            System.out.println("Enter deposit amount:");
	            int b=sc.nextInt();
	            System.out.println(b +"is deposit sucessfully");
	            break;
	       case 3:
                 System.out.println("Your current balance is verified");
                 break;
	      default:
	            System.out.println("INVALID NUMBER!!");
	            
	    }
sc.close();
	}
}