import java.util.Scanner;
public class Numbers {

    static void Somar (int numero1, int numero2){
        int resultado = numero1 + numero2;
        System.out.println("Resultado: "+ resultado);
    }
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Introduza o numero 1");
        int numero1 = Integer.parseInt(in.nextLine());

        System.out.println("Introduza o numero 2");
        int numero2 = Integer.parseInt(in.nextLine());

        Somar(numero1,numero2);
    }
}
