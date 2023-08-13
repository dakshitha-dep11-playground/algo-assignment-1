import java.util.Scanner;

public class Algo5 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            System.out.print("Enter your String (ASCII only) : ");
            String enteredString = scanner.nextLine().strip();
            if (enteredString.isBlank()) {
                System.out.println("String cannot be empty");
                continue;
            }
            String reverseString = "";

            for (int i = enteredString.length() - 1; i >= 0; i--)
                reverseString += enteredString.substring(i, i + 1);
            System.out.println(reverseString);

        } while (true);
    }
}
