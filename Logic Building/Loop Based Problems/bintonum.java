import java.util.Scanner;
class bintonum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Binary value: ");
        String binary=sc.nextLine();
        int num=Integer.parseInt(binary,2);
        System.out.println(num);
    }
}