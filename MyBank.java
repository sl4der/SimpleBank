import java.util.*;

public class MyBank {
    static Scanner in = new Scanner(System.in);
    static int accounts = 0;
    static ArrayList<Checkings> checking = new ArrayList<>();
    static ArrayList<Saving> saving = new ArrayList<>();
        public static void main(String[] args) {

        int id = 0;

        boolean done = false;
        do {
            System.out.println("\n********************************** \n\n"
                    + "Select an option: \n" +
                    "1) Open a checking account \n" +
                    "2) Checking deposit \n" +
                    "3) Checking withdraw \n" +
                    "4) Print checking account info. \n" +
                    "5) Open a saving account \n" +
                    "6) Saving deposit. \n" +
                    "7) Saving withdraw. \n" +
                    "8) Print monthly interest \n" +
                    "9) Print saving account info. \n" +
                    "10) Exit ");
            int option;
            option = in.nextInt();
            System.out.println("\n**********************************\n");

            switch (option) {
                case 1:
                    openChecking();
                    break;

                case 2:
                    checkDepo();
                    break;

                case 3:
                    checkWith();
                    break;

                case 4:
                    PrintCheckings();
                    break;

                case 5:
                    OpenSavings();
                    break;

                case 6:
                    SaveDepo();
                    break;

                case 7:
                    SaveWith();
                    break;

                case 8:
                    PrintMontlyInt();
                    break;

                case 9:
                    PrintSavingsInfo();
                    break;

                case 10:
                    done = true;
                    break;
            }
        }
        while(!done);
    }

    private static void openChecking() {
            accounts++;
        System.out.println("Enter initial balance for account # " + accounts);
        double initial = in.nextDouble();
        checking.add(new Checkings(accounts, initial));
    }

    private static void checkDepo() {
        System.out.println("Enter account number: ");
        int id = in.nextInt();
        if(id - 1 >= accounts) {
            System.out.println("Account #" + id + " not found.");
        }
        else {
            System.out.println("Enter deposit amount: ");
            double deposit = in.nextDouble();
            checking.get(id - 1).deposit(deposit);
        }
    }

    private static void checkWith() {
        System.out.println("Enter account number: ");
        int id = in.nextInt();
        if(id - 1 >= accounts) {
            System.out.println("Account #" + id + " not found.");
        }
        else {
            System.out.println("Enter withdraw amount: ");
            double withdraw = in.nextDouble();
            checking.get(id - 1).withdraw(withdraw);
        }
    }

    private static void PrintCheckings() {
        System.out.println("Enter account number: ");
        int id = in.nextInt();
        if(id - 1 >= accounts) {
            System.out.println("Account #" + id + " not found.");
        }
        else {
            System.out.println(checking.get(id - 1));
        }
    }
    private static void OpenSavings() {
            accounts++;
        System.out.println("Enter initial balance for account # " + accounts);
        double initial = in.nextDouble();
        System.out.println("Enter annual interest rate for account # " + accounts + ": ");
        double rate = in.nextDouble();
        saving.add(new Saving(accounts, initial, rate));
        checking.add(new Checkings(accounts));
    }

    private static void SaveDepo() {
        System.out.println("Enter account number: ");
        int id = in.nextInt();
        if(id - 1 >= accounts) {
            System.out.println("Account #" + id + " not found.");
        }
        else {
            System.out.println("Enter deposit amount: ");
            double deposit = in.nextDouble();
            saving.get(id - 1).deposit(deposit);
        }
    }

    private static void SaveWith() {
        System.out.println("Enter account number: ");
        int id = in.nextInt();
        if(id - 1 >= accounts) {
            System.out.println("Account #" + id + " not found.");
        }
        else {
            System.out.println("Enter withdraw amount: ");
            double withdraw = in.nextDouble();
            saving.get(id - 1).withdraw(withdraw);
        }
    }

    private static void PrintMontlyInt() {
        System.out.println("Enter account number: ");
        int id = in.nextInt();
        if(id - 1 > accounts) {
            System.out.println("Account #" + id + " not found.");
        }
        else {
            double interestEarned = saving.get(id - 1).getMonthlyInterest();
            System.out.println("Account #" + id + " earned $" + interestEarned + " interest.");
        }
    }

    private static void PrintSavingsInfo() {
        System.out.println("Enter account number: ");
        int id = in.nextInt();
        System.out.println(saving.get(id - 1));
    }
}
