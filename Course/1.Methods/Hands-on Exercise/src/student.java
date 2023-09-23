import java.util.Scanner;

public class student {
    public static void main(String[] args) {
        // create a scanner to new entry
        Scanner scanner = new Scanner(System.in);

        // Request user name
        System.out.print("Insert student name: ");
        String name = scanner.nextLine();

        // Request user age
        System.out.print("Insert student age: ");
        int age = scanner.nextInt();

        // Request user grade
        System.out.print("Insert student grade: ");
        double grade = scanner.nextDouble();

        // Close Scanner
        scanner.close();


        // Imprime os dados do estudante formatados adequadamente
        System.out.println("\nStudent Info:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Exam grade: " + grade);
    }
}