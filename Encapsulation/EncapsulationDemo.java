package Encapsulation;

class Account{
    private double balance;

    public double getBalance(){
        return this.balance;
    }

    public void setBalance(double newBalance){
        this.balance=newBalance;
    }
}

public class EncapsulationDemo {

    public static void main(String args[]){
        Account acc = new Account();

        acc.setBalance(200);
        System.out.println(acc.getBalance());
    }

}
