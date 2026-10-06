import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double sum = 0;
        int count = 0;
        double highest = 0;
        double lowest = 100;

        System.out.println("Enter grades one by one. Type -1 when you are finished.");

        while (true) {
            System.out.print("Enter grade (or -1 to finish): ");
            double grade = scanner.nextDouble();

            if (grade == -1) {
                break;
            }

            if (grade < 0) {
                System.out.println("Invalid grade. Please enter a positive number or -1 to stop.");
                continue;
            }

            sum += grade;
            count++;

            if (grade > highest) {
                highest = grade;
            }
            if (grade < lowest) {
                lowest = grade;
            }
        }

        if (count > 0) {
            double average = sum / count;
            System.out.println("\n--- Results ---");
            System.out.println("Total grades entered: " + count);
            System.out.println("Highest grade: " + highest);
            System.out.println("Lowest grade: " + lowest);
            System.out.println("Average grade: " + average);
        } else {
            System.out.println("\nNo valid grades were entered.");
        }

        scanner.close();
    }
}