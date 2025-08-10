import java.util.Scanner;
class inputsumevenorodd{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the 1st Number: ");
        int num1=sc.nextInt();
        System.out.print("Enter the 2nd Number: ");
        int num2=sc.nextInt();
        int sum=num1+num2;
        if(sum%2==0){
            System.out.println("The sum of two numbers is EVEN");
        }else{
            System.out.println("The sum of two numbers is ODD");
        }
    }
}