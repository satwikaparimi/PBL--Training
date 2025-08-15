import java.util.Scanner;
class numseparate{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num=sc.nextInt();
        String nums=Integer.toString(num);
        int len=nums.length();
        for(int i=0;i<len;i++){
            char ch=nums.charAt(i);
            System.out.print(ch);
            if(i<len-1){
                System.out.print(",");
            }
        }
    }
}