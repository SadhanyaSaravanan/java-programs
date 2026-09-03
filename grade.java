import java.util.Scanner;
public  class grade {

	static void detail(Scanner sc) {
		System.out.println("Enter your Name:");
		String name=sc.nextLine();
		System.out.println("Enter your Department: ");
		String dept=sc.nextLine();
		System.out.println("Enter your year:");
		int year=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter your age");
		int age=sc.nextInt();
		sc.nextLine();
	}

	
		static double avg(Scanner sc) {
        int[] marks = new int[5];
        int total = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter your subject " + (i + 1) + " mark :");
            marks[i] = sc.nextInt();

            if (marks[i] >= 0 && marks[i] <= 100) {
                if (marks[i] < 35) {
                    System.out.println("fail!! Dosen't able to calculate average and grade");
                }
                total += marks[i];
            } else {
                System.out.println("Invalid mark!");
                
            }
        }

        double average = (double) total / 5;
        return average;
    }
                
                
	static void calculate( double mark) {
		if(mark>=90&&mark<=100) {
			System.out.println("\nGRADE:A+");
		}
		else if(mark>=80&&mark<90) {
			System.out.println("\nGRADE:B+");
		} else if(mark>=60&&mark<80) {
			System.out.println("\nGRADE:C+");
		} else if(mark>=50&&mark<60) {
			System.out.println("\nGRADE:D+");
		}
		else {
			System.out.println("\n FAIL");
		}
	}
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		detail(sc);
		double result=avg(sc);
		System.out.printf("%.2f"+ " is your average",result);
		calculate(result);
		sc.close();
	}
}
