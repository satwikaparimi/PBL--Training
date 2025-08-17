import java.util.Scanner;
public class ReplaceVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        String vowels = "aeiouAEIOU";
        boolean found = false;
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (vowels.indexOf(ch) != -1) {
                result = result + "Z";
                found = true;
            } else {
                result = result + ch;
            }
        }
        if (found) {
            System.out.println("Modified string: " + result);
        } else {
            System.out.println("No vowels present: " + s);
        }
    }
}
