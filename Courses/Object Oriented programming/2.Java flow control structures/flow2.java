import java.util.Scanner;

public class flow2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String option;

        do {
            System.out.print("The alarm rang.");
            System.out.print("Are you still sleepy (Yes/No) ?");
            option = in.nextLine();
        } while (option.equals("Yes"));

        System.out.print("Get up");
        option = in.nextLine();
        System.out.print("Get dressed");
        option = in.nextLine();

        System.out.println("Do you want to take the breakfast outside ?");
        option = in.nextLine();
        if (option.equals("S")) {
            System.out.print("Had breakfast outside");
        }

        System.out.print("Went out!");
    }

}


