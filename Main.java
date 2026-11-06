import java.util.Scanner;

public class Main {

    static int findLength(String str, int index) {

        if (index == str.length()) {
            return 0;
        }

        return 1 + findLength(str, index + 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int length = findLength(str, 0);

        System.out.println("Length of string: " + length);
    }
}