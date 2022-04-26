import java.util.*;
class Saving extends Account{
    private double annualInterestRate;
    public Saving() {
    }

    public Saving(int id, double balance, double rate) {
        super(id, balance);
        this.annualInterestRate = rate;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double rate) {
        this.annualInterestRate = rate;
    }

    public double getMonthlyInterest() {
        return ((this.balance * this.annualInterestRate / 100) / 12.00);
    }
    @Override
    public void withdraw(double amount) {
        if(amount <= this.getBalance()) {
            this.balance -= amount;
        }
        else {
            System.out.println("Error: Account will be overdrawn. Withdraw cancelled.");
        }
    }
    public String toString() {
        return "Savings" +
                "\n"+super.toString()+
                "\nInterest Rate: " + this.getMonthlyInterest() + "%";
    }
}