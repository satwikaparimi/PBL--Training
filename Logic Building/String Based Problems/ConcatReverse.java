import java.util.Scanner;
public class ConcatReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();
        String s2Rev = new StringBuilder(s2).reverse().toString();
        String s3 = s1 + s2Rev;
        System.out.println("Final string: " + s3);
    }
}
