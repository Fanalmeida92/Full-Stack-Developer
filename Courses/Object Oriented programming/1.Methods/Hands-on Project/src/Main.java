import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object for keyboard input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the student's name
        System.out.print("Enter the student's name: ");
        String studentName = scanner.nextLine();

        // Prompt the user to enter the student's age
        System.out.print("Enter the student's age: ");
        int studentAge = scanner.nextInt();

        // Prompt the user to enter the student's exam score
        System.out.print("Enter the student's exam score: ");
        double examScore = scanner.nextDouble();

        // Close the Scanner object
        scanner.close();

        // Display the student's data in a formatted manner
        System.out.println("\nStudent Data:");
        System.out.println("Name: " + studentName);
        System.out.println("Age: " + studentAge);
        System.out.println("Exam Score: " + examScore);
    }
}
