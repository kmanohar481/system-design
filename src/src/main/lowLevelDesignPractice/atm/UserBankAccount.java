package atm;

public class UserBankAccount {

    int balance = 0;

    public void withdrawalBalance(int amount){

        if(amount>this.balance){
            System.out.println("can not be able to withdraw money");
        }
        this.balance  = this.balance - amount;

    }


    public void depositBalance(int amount){
        this.balance  = this.balance  + amount;
    }

}
