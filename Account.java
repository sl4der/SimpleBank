import java.util.Date;
// defining Account class
class Account{
    // creating data fields
    protected int id;
    protected double balance;
    protected Date dateOpened;

    // creating no-arg constructor
    Account(){
        dateOpened = new Date();
        id = 0;
        balance = 0;
    }

    // creating a parameterized constructor
    Account(int id,double balance){
        this.id = id;
        this.balance = balance;
        dateOpened = new Date();
    }

    //defining getter for id
    double getId(){
        return id;
    }

    // defining getter for balance
    public double getBalance(){
        return balance;
    }

    // defining setter for id
    void setId(int id){
        this.id = id;
    }

    // defining setter for balance
    void setBalance(double balance){
        this.balance = balance;
    }

    // defining getter for dateOpened
    Date getDate() {
        return dateOpened;
    }

    // defining withdraw method
    void withdraw(double amount){
        // validation for withdraw
        if(balance > amount){
            // updating balance
            balance = balance - amount;
            System.out.println("after withdrawing balance is: "+ balance);
        }
        else System.out.println("Error: Withdraw cancelled. Account over draft");
    }

    // defining deposit method
    void deposit(double amount){
        // updating balance
        balance = balance + amount;
        System.out.println("new balance: "+balance);
    }

    // Override toString method
    public String toString(){
        return "Account id: " + id + "\nAccount opened: " + dateOpened + "\nBalance: $" + balance;
    }
}