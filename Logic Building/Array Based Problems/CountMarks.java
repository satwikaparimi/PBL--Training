import java.util.*;

class CountMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 30;  
        int[] marks = new int[N];
        int[] count = new int[101];
        for (int i = 0; i < N; i++) {
            System.out.print("Enter mark for student " + (i + 1) + " (0-100): ");
            marks[i] = sc.nextInt();

            
            if (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid mark! Please enter between 0 and 100.");
                i--;
                continue;
            }
            count[marks[i]]++;
        }
        System.out.println("\nCount of Students per Mark:");
        for (int m = 0; m <= 100; m++) {
            if (count[m] > 0) {
                System.out.println("Mark " + m + ": " + count[m] + " student(s)");
            }
        }
    }
}
