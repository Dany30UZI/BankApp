import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int check;
        long suma;
        String name;
        int age;
        long balance;

        System.out.println("Introduce Datele tale!");
        System.out.println("Numele tau: ");
        Scanner n = new Scanner(System.in);
        name = n.next();

        System.out.println("Varsta: ");
        Scanner a = new Scanner(System.in);
        age = a.nextInt();

        System.out.println("Balanta: ");
        Scanner b = new Scanner(System.in);
        balance = b.nextLong();

        Client client = new Client(name, age,balance);

        boolean start = true;
        while(start) {

            System.out.println("1.Detalii cont");
            System.out.println("2.Depozit");
            System.out.println("3.Retragere numerar");
            System.out.println("4.Opreste aplicatia");

            Scanner sc = new Scanner(System.in);
            check = sc.nextInt();

            if (check == 1) {
                System.out.println(client);
            } else if (check == 2) {
                System.out.println("Depozitati suma");
                Scanner z = new Scanner(System.in);
                suma = z.nextLong();
                System.out.println("Balanta actualizata " + client.deposit(suma));
            } else if (check == 3){
                System.out.println("Retragere numerar");
                Scanner c = new Scanner(System.in);
                suma = c.nextLong();
                     if(suma > client.checkBalance()){
                         System.out.println("Fonduri insuficiente");
                     }else  System.out.println("Balanta actualizata " + client.withdraw(suma));
            } else if (check == 4){
                start = false;
            }
        }

    }
}