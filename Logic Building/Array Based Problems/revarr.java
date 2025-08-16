import java.util.*;
class revarr{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=10;
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter array elemnt of "+i+": ");
            arr[i]=sc.nextInt();
        }
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
