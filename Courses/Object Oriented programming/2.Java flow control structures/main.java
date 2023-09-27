import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("First number - ");
        int num1 = in.nextInt();

        System.out.print("Second number - ");
        int num2 = in.nextInt();

        int soma= num1 + num2;

        if (soma < 0){
            System.out.println("Wow! Negative result");
        }

        System.out.println("Soma - " + soma);

    }
}
