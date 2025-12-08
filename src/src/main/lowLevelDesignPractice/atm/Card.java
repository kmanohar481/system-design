package atm;

public class Card {

    private final  int PIN_NUMBER  = 1234;
    private int cardNumber;
    private int cvv;
    private int expiryDate;

    private String holderName;

    private UserBankAccount bankAccount;


    public boolean isCorrectPINEntered(int pin){

        if(this.PIN_NUMBER  == pin){
            return  true;
        }
        return false;

    }

    public int getBalance(){
        return  bankAccount.balance;

    }

    public void deductBankBalance(int amount){
        bankAccount.withdrawalBalance(amount);

    }

    public void setBankAccount(UserBankAccount userBankAccount){
        this.bankAccount = userBankAccount;
    }

}
