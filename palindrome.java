import java.util.*;
public class palindrome{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		String a=sc.nextInt().toLowerCase();
		String b= "";
		for(int i=s.length()-1;i>=0;i--){
			b=b+input.charAt(i);
		}
		if(a==b){
			System.out.println("Palindrome");
		}			
		else{
			System.out.println("Not a palindrome")
		}
		sc.close();
}
}