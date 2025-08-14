import java.util.*;
class sumofthree{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1=sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2=sc.nextInt();
        System.out.print("Enter 3rd number: ");
        int num3=sc.nextInt();
        int sum=num1+num2+num3;
        System.out.println("Sum of Three Numbers is: "+sum);
    }
}