import java.util.*;
class countnums{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number");
        int num=sc.nextInt();
        String nums=Integer.toString(num);
        int len=nums.length();
        System.out.println(len);
    }
}