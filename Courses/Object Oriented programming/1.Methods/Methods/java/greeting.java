public class greeting {
    static void Cumprimentar(String periodo){
        if (periodo.equals("dia"))
        {
            System.out.println("Bom dia");
        }
        else if (periodo.equals("tarde"))
        {
            System.out.println("Boa Tarde!");
        }
        else if (periodo.equals("noite"))
        {
             System.out.println("Boa Noite!");
        }
    }
    public static void main(String[] args) {
        Cumprimentar("tarde");
        }
}

