import java.util.Scanner;

public class Algo9 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        loop1: do {
            System.out.print("Enter the String you want to check : ");
            String eneteredString = scanner.nextLine().strip();
            if (eneteredString.isBlank()) {
                System.out.println("Word cannot be empty");
                continue;
            }

            for (int i = 0; i < eneteredString.length(); i++) {
                if (eneteredString.charAt(i) == ' ') {
                    System.out.println("Please enter one word");
                    continue loop1;
                }
            }
            eneteredString = eneteredString.toLowerCase();              
            for (int i = 0; i < eneteredString.length() / 2; i++) {
                if (eneteredString.charAt(i) != eneteredString.charAt(eneteredString.length() - 1 - i)) {
                    System.out.println("Not a palindrome.");
                    continue loop1;
                }
            }
            System.out.println("Eneterd word : \"" + eneteredString + "\" is a palindrome");

        } while (true);
    }
}
