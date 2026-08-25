import java.util.Scanner;
class Add {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a=sc.nextInt();
        System.out.println("Enter the value of b:");
        int b=sc.nextInt();
        System.out.println("ADDITION:"+(a+b));
        sc.close();
        }
}