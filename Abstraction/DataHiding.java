package Abstraction;

class BankAccount{
    private double balance = 10000;
    private String username="Zemoso";
    private String password="password";

    public double getWalletBalance(String username, String password){
        if(username.equals(this.username) && password.equals(this.password)){
            return balance;
        }
        else{
            return -1;
        }
    }
}

  public class DataHiding {
     public static void main(String args[]){
         BankAccount b1 = new BankAccount();
         double bal =b1.getWalletBalance("Zemoso","password");
         System.out.println(bal);
     }

  }
