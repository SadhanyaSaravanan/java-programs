import java.util.Scanner;
public class info {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Name:");
		String name=sc.nextLine();
		System.out.println("Enter your Department:");
		String dept=sc.nextLine();
		System.out.println("Enter your Regno:");
		String reg=sc.nextLine();
		System.out.println("Enter your Year:");
		int num=sc.nextInt();
		System.out.println("Enter your mark 1:");
		int m1=sc.nextInt();
		System.out.println("Enter your mark 2:");
		int m2=sc.nextInt();
		System.out.println("Enter your mark 3:");
		int m3=sc.nextInt();
		System.out.println("Enter your mark 4:");
		int m4=sc.nextInt();
		System.out.println("Enter your mark 5:");
		int m5=sc.nextInt();
		double avg=(m1+m2+m3+m4+m5)/5;
		System.out.println("%.2f,AVERAGE:"+avg);
		if(m1>=50&&m2>=50&&m3>=50&&m4>=50&&m5>=50) {
			if(avg>=90&&avg<=100) {
				System.out.println("GRADE A");
			}
			else if(avg>=70&&avg<90) {
				System.out.println("GRADE B");
			}
			else if(avg>=60&&avg<70) {
				System.out.println("GRADE C");
			}
			else if(avg>=50&&avg<60) {
				System.out.println("GRADE D");
			}
			else {
				System.out.println("FAIL");
			}
		}
		else {
			System.out.println("your subject mark is below 50");
		}

	sc.close();
}
}
