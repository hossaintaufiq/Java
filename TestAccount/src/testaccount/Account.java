
package testaccount;
public class Account {
    private int accountNumber=225368;
    private double balance=0.0;
    
    public void Account(int accountNumber, double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    public void Account(int accountNumber){
        this.accountNumber=accountNumber;
    }
    
    public int getAccountNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }
    
    public void setBalance(double balance){
        this.balance=balance;
    }
    
    public void credit(double ammount){
        balance +=ammount;
    }
    public void debit(double ammount){
        if(balance>=ammount){
            balance-=ammount;
        }
        else{
            System.out.println("ammount withdrow exceeds the current balance");
        }
    }
    
    @Override
    public String toString(){
        return "A/C no: "+accountNumber + ", Balance = $"+balance;
    }
}
