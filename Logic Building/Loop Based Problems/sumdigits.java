import java.util.Scanner;
class sumdigits{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num=sc.nextInt();
        String nums=Integer.toString(num);
        int len=nums.length();
        int nu=0,sum=0;
        for(int i=0;i<len;i++){
            nu=num%10;
            sum+=nu;
            num/=10;
        }
        System.out.println(sum);
    }
}