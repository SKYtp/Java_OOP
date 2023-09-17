import java.util.Date;
import java.util.GregorianCalendar;

public class Account {
    GregorianCalendar cal = new GregorianCalendar();
    private int id = 0;
    private double balance = 0;
    public static double annualInterestRate = 0;
    public static char[] getDate;
    protected Date dateCreated;
    private double decimalMIR;
    protected double keepW;
    protected double balanceB;
    protected int c = 0;
    Account(){
        dateCreated = cal.getTime();
    }
    Account(double newBalance,double annualInterestRate){
        dateCreated = cal.getTime();
        this.balance = newBalance;
        this.annualInterestRate = annualInterestRate;
    }
    public void editAccount(int newId ,double newBalance,double newAnnual){
        id = newId;
        balance = newBalance;
        annualInterestRate = newAnnual;
    }
    public int getId(){
        return id;
    }
    public void editId(int newId){
        id = newId;
    }
    public double getBalance(){
        return balance;
    }
    public void editBalance(Double newBalance){
        balance = newBalance;
    }
    public double getAnnual(){
        return annualInterestRate;
    }
    public void editAnnual(Double newAnnual){
        annualInterestRate = newAnnual;
    }
    public Date getDate(){
        return dateCreated;
    }
    public double getMonthlyInterestRate(){
        decimalMIR = (annualInterestRate/100)/12;
        return decimalMIR * 100;
    }
    public double getMonthlyInterest(){
        decimalMIR = (annualInterestRate/100)/12;
        return decimalMIR * balance;
    }
    public void withdraw(double withdraws){
        this.balanceB = this.balance;
        keepW = withdraws;
        balance = balance - withdraws;
        this.c = 1;
    }
    public void deposit(double deposits){
        this.balanceB = this.balance;
        this.c = 2;
        //balance = balance + deposits;
    }
    protected void setBalance(double balance){
        this.balance = balance;
    }
    public String toString(){
        if(c == 2){
            return "\nAccount" +"\nNo limit"+ "\nBalance is: " + balanceB + "\nDeposit: " + keepW + "\nBalance is: " + balance + "\nThis account was created at " + dateCreated;
        }
        return "\nAccount" +"\nNo limit"+ "\nBalance is: " + balanceB + "\nWithdraw: " + keepW + "\nBalance is: " + balance + "\nThis account was created at " + dateCreated;
    }
}
