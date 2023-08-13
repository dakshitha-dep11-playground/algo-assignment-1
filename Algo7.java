import java.util.Scanner;

public class Algo7 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
        do {

            System.out.print("Enter your senetence (ASCII only) : ");
            String enteredString = scanner.nextLine().strip();
            if (enteredString.isBlank()) {
                System.out.println("String cannot be empty");
                continue;
            }
            enteredString = " " + enteredString + " ";

            int longestWorldLength = 0;
            int shortestWordlength = enteredString.length();
            String longetsWord = "";
            String shortestWord = "";
            int endWordAt = -1;
            int startWordAt = -1;
            String newWord;

            for (int i = enteredString.length() - 1; i >= 0; i--) {
                if (startWordAt != i && enteredString.charAt(i) == ' ') {
                    endWordAt = startWordAt;
                    startWordAt = i;
                } else {
                    continue;
                }

                if (endWordAt > -1 && enteredString.charAt(i) == ' ') {
                    newWord = enteredString.substring(startWordAt + 1, endWordAt);

                    if (newWord.length() > longestWorldLength) {
                        longestWorldLength = newWord.length();
                        longetsWord = newWord;
                    }

                    if (newWord.length() < shortestWordlength) {
                        shortestWordlength = newWord.length();
                        shortestWord = newWord;
                    }
                }

            }
            System.out.println("Shortest Word : \""+shortestWord +"\" with letter count : "+ shortestWordlength);
            System.out.println("Longest Word : \""+ longetsWord + "\" with letter count : "+ longestWorldLength);
        } while (true);
    }
}
