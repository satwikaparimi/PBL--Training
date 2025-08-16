import java.util.*;
class inputarrsum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=10;
        int sum=0;
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter array elemnt of "+i+": ");
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        System.out.println("Sum of Array Elements: "+sum);
    }
}
