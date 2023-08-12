import java.util.Scanner;

public class Algo1 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int secondLastNumber;
        int lastNumber;
        int totalOfLastTwoNumbers;
        String output;
        int numberOfElemnts;
        int count;

        System.out.print("Enter the number of elements need to be in the fibbonachi sequence : ");
        numberOfElemnts = scanner.nextInt();
        scanner.nextLine();
        if(numberOfElemnts==1)System.out.println("0");
        else if(numberOfElemnts==2)System.out.println("0, 1");
        else{

        secondLastNumber = 0;
        lastNumber = 1;
        totalOfLastTwoNumbers = 0;
        output = "0, 1, ";

        count = 2;
        do {

            totalOfLastTwoNumbers = lastNumber + secondLastNumber;
            output += totalOfLastTwoNumbers+", ";
            secondLastNumber = lastNumber;
            lastNumber = totalOfLastTwoNumbers;
            count++;
        } while (count < numberOfElemnts);
        System.out.println(output+"\b".repeat(2)+" ".repeat(3));

    }
    }
}