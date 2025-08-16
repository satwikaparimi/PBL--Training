import java.util.*;
class inputarr{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=10;
        int sum=0;
        int avg;
        int count=0;
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter array elemnt of "+i+": ");
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        avg=sum/size;
        for(int i=0;i<size;i++){
            if(arr[i]<avg){
                count++;
            }
        }
        System.out.println("Aveg of Array is: "+avg);
        System.out.println("Array Elemnets count less than Avg is : "+count);

    }
}