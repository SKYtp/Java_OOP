import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;

public class NewAccount {
    GregorianCalendar cal = new GregorianCalendar();
    private int id = 0;
    private double balance = 0;
    public static double annualInterestRate = 0;
    public static char[] getDate;
    private String name = "";
    private Date dateCreated;
    private double decimalMIR;
    ArrayList<Transaction> transactions = new ArrayList<Transaction>();  
    NewAccount(){
        dateCreated = cal.getTime();
    }
    NewAccount(String name,int newId ,double newBalance){
        dateCreated = cal.getTime();
        this.name = name;
        id = newId;
        balance = newBalance;
    }
    public void editAccount(int newId ,double newBalance,double newAnnual){
        id = newId;
        balance = newBalance;
        annualInterestRate = newAnnual;
    }
    public String getname(){
        return name;
    }
    public void editname(String name){
        this.name = name;
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
        balance = balance - withdraws;
        transactions.add(new Transaction('W', withdraws, this.balance));
    }
    public void deposit(double deposits){
        balance = balance + deposits;
        transactions.add(new Transaction('D', deposits, this.balance));
    }
    protected void setBalance(double balance){
        this.balance = balance;
    }
    public void printTransaction(){
        int r = transactions.size();
        for(int i = 0;i < r;i++){
            System.out.println(transactions.get(i).date +"      " + transactions.get(i).type
            +"      " + transactions.get(i).amount + "      "+ transactions.get(i).balance);
        }
    }
}
class Transaction{
    Date date = new Date();
    char type;
    double amount;
    double balance;

    Transaction(char type,double amount, double balance){
        this.type = type;
        this.amount = amount;
        this.balance = balance;
    }
    
}
