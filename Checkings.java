class Checkings extends Account {
    private double overdraftlimit;

    // default constructor
    Checkings(int i) {
        // call base class constructor
        super();
        overdraftlimit = 500;
    }

    // parameterized constructor
    Checkings(int id, double balance) {
        // call base class constructor
        super(id, balance);
        overdraftlimit = 500;
    }

    // override the withdraw method
    public void withdraw(double amount) {
        // check if account balance is enough
        if (balance > amount) {
            // check if amount is less than overdraftlimit
            if (amount < balance + overdraftlimit) {
                balance = balance - amount;
                System.out.println("after withdrawing balance is: " + balance);
            }
            else
                System.out.println("Error: Withdraw cancelled. Account over draft\n" + overdraftlimit);
        } else
            System.out.println("Error: Withdraw cancelled. Account over draft ");
    }

    // override the toString method
    public String toString() {
        return "Checkings \n" + super.toString();
    }
}