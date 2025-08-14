import java.util.Scanner;
class readevenoddzero{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num=sc.nextInt();
        if(num==0){
            System.out.println("Given Number is Zero");
        }else if(num%2==0){
            System.out.println("Given Number is Even");
        }else if(num%2!=0){
            System.out.println("Given Number is Odd");
        }
    }
}