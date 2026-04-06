class bankaccount{
    private double balance;
    public void setBalance(double balance){//setter method
       if(balance>0){ this.balance=balance;}
       else{ System.out.println("balance cannot be negative");}
    }
    public double getbalance(){//getter methods
        return balance;
    }
    public void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance-=amount;
        }
        else{ System.out.println("invalid amount to withdraw");}
    }
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
        }
        else{ System.out.println("invalid amount to deposit");}
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        bankaccount b=new bankaccount();
        b.setBalance(1000);
        System.out.println(b.getbalance());
        b.withdraw(500);
        System.out.println(b.getbalance());
        b.withdraw(1100);
        System.out.println(b.getbalance());
        b.deposit(200);
        System.out.println(b.getbalance());
        b.deposit(-100);
        System.out.println(b.getbalance());
         
    }
}