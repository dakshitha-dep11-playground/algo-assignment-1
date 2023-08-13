import java.util.Scanner;

public class Algo6 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
        do {
            System.out.print("Enter your senetence (ASCII only) : ");
            String enteredString = scanner.nextLine().strip();
            if (enteredString.isBlank()) {
                System.out.println("String cannot be empty");
                continue;
            }
            enteredString = " "+enteredString+" ";
            String reverseSentenceString = "";
            int endWordAt = -1;
            int startWordAt = -1;
            

            for (int i = enteredString.length() - 1; i >= 0; i--) {
                if (startWordAt != i && enteredString.charAt(i) == ' ') {
                    endWordAt = startWordAt;
                    startWordAt = i;
                } else {
                    continue;
                }
                
                if (endWordAt > -1 && enteredString.charAt(i) == ' ') {
                    reverseSentenceString += enteredString.substring(startWordAt + 1, endWordAt) + " ";
                }
            }
            System.out.println(reverseSentenceString);

        } while (true);
    }
}
