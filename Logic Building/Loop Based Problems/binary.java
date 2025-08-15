import java.util.Scanner;
class binary{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number to convert into Binary: ");
        int num=sc.nextInt();
        String binary=Integer.toBinaryString(num);
        System.out.println(binary);
    }
}