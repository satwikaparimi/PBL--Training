import java.util.*;
class integercount{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int ncount=0;
        int pcount=0;
        for(int i=1;i<=5;i++){
            System.out.print("Enter the number "+i+" : ");
            int num=sc.nextInt();
            if(num>=0){
                pcount++;
            }else{
                ncount++;
            }
        }
        System.out.println("Positive count is : "+pcount);
        System.out.println("Negative count is : "+ncount);
        
    }
}