import java.util.Scanner;
class passcount{
    public static void main(String[] args){
        int count=0;
        Scanner sc =new Scanner(System.in);
        for(int i=1;i<=3;i++){
            System.out.print("Enter marks for student "+i+": ");
            int marks=sc.nextInt();
            if(marks>=35){
                count++;
            }
        }
        System.out.println(count);
    }
}