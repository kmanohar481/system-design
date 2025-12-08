package atm.ATMStates;

import atm.ATM;
import atm.Card;

public class CheckBalanceState extends  ATMState {

    public CheckBalanceState(){

    }

    @Override
    public void displayBalance(ATM atm, Card card) {
        System.out.println("your card balance is " + card.getBalance());
        atm.setCurrentATMState(new IdleState());
        exit(atm);
    }

    @Override
    public void exit(ATM atm){
        returnCard();
        atm.setCurrentATMState(new IdleState());
        System.out.println("exit happens");
    }

    @Override
    public void returnCard(){
        System.out.println("please collect your card");
    }


}
