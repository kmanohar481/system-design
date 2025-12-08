package atm;

import atm.ATMStates.ATMState;
import atm.ATMStates.IdleState;

public class ATM {

    private static ATM atmObject = new ATM();

    ATMState currentATMState;

    private int atmBalance;
    int noOfTwoThousandNotes;
    int noOfFiveHundredNotes;

    int noOfOneHundredNotes;

    public int getAtmBalance() {
        return atmBalance;
    }

    public void setCurrentATMState(ATMState currentATMState) {
        this.currentATMState = currentATMState;
    }

    public ATMState getCurrentATMState() {
        return currentATMState;
    }

    public static ATM getATMObject() {
        atmObject.setCurrentATMState(new IdleState());
        return atmObject;
    }


    public void setAtmBalance(int atmBalance, int noOfTwoThousandNotes, int noOfFiveHundredNotes, int noOfOneHundredNotes) {
        this.atmBalance = atmBalance;
        this.noOfTwoThousandNotes = noOfTwoThousandNotes;
        this.noOfFiveHundredNotes = noOfFiveHundredNotes;
        this.noOfOneHundredNotes = noOfOneHundredNotes;
    }

    public void setAtmBalance(int atmBalance) {
        this.atmBalance = atmBalance;
    }

    public int getNoOfTwoThousandNotes() {
        return noOfTwoThousandNotes;
    }

    public void setNoOfTwoThousandNotes(int noOfTwoThousandNotes) {
        this.noOfTwoThousandNotes = noOfTwoThousandNotes;
    }

    public int getNoOfFiveHundredNotes() {
        return noOfFiveHundredNotes;
    }

    public void setNoOfFiveHundredNotes(int noOfFiveHundredNotes) {
        this.noOfFiveHundredNotes = noOfFiveHundredNotes;
    }

    public int getNoOfOneHundredNotes() {
        return noOfOneHundredNotes;
    }

    public void deductOneHundredNotes( int noOfOneHundredNotes) {
        this.noOfOneHundredNotes = this.noOfOneHundredNotes - noOfOneHundredNotes;
    }

    public void deductFiveHundredNotes( int noOfFiveHundredNotes) {
        this.noOfFiveHundredNotes = this.noOfFiveHundredNotes - noOfFiveHundredNotes;
    }

    public void deductTwoThousandNotes( int noOfTwoThousandNotes) {
        this.noOfTwoThousandNotes = this.noOfTwoThousandNotes - noOfTwoThousandNotes;
    }

    public void deductATMBalance( int balance) {
        this.atmBalance = this.atmBalance - balance;
    }

    public void setNoOfOneHundredNotes(int noOfOneHundredNotes) {
        this.noOfOneHundredNotes = noOfOneHundredNotes;
    }

    public void printCurrentATMStatus(){
        System.out.println("Balance: " + atmBalance);
        System.out.println("2kNotes: " + noOfTwoThousandNotes);
        System.out.println("500Notes: " + noOfFiveHundredNotes);
        System.out.println("100Notes: " + noOfOneHundredNotes);
    }
}
