import java.util.Scanner;
class example {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Name:");
        String name=sc.nextLine();
        System.out.println("Enter your Age:");
        int age=sc.nextInt();
        System.out.println("Enter your Grade:");
        char grade=sc.next().charAt(0);
        System.out.println("Enter your CGPA:");
        double cgpa=sc.nextDouble();
        if(cgpa>5){
            boolean pass =true;
            System.out.println("PASS");
        }
        else{
            System.out.println("FAIL");
        }
sc.close();
    }
}