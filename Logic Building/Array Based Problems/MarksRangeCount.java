import java.util.Scanner;
public class MarksRangeCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 30;
        int[] marks = new int[N];
        System.out.println("Enter " + N + " students' marks (0-100):");
        for (int i = 0; i < N; i++) {
            marks[i] = sc.nextInt();
        }
        int[] rangeCount = new int[10];
        for (int i = 0; i < N; i++) {
            int mark = marks[i];
            int rangeIndex = mark / 10;  
            if (mark == 100) rangeIndex = 9;
            rangeCount[rangeIndex]++;
        }
        System.out.println("\nCount of students in each range:");
        for (int i = 0; i < 10; i++) {
            int lower = i * 10 + (i == 0 ? 0 : 1); 
            int upper = (i + 1) * 10;
            if (i == 0) lower = 0; 
            if (i == 9) upper = 100; 
            System.out.println("Marks " + lower + " to " + upper + ": " + rangeCount[i] + " student(s)");
        }
    }
}
