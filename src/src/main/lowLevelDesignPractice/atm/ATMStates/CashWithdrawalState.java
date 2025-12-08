package atm.ATMStates;

import atm.ATM;
import atm.AmountWithdrawal.CashWithdrawProcessor;
import atm.AmountWithdrawal.FiveHundredWithdrawProcessor;
import atm.AmountWithdrawal.OneHundredWithdrawProcessor;
import atm.AmountWithdrawal.TwoThousandWithdrawProcessor;
import atm.Card;

public class CashWithdrawalState extends ATMState {

    public CashWithdrawalState() {
        System.out.println("Please enter the Withdrawal Amount");
    }


    public void cashWithdrawal(ATM atm, Card card, int withdrawalAmountRequest){

        if(atm.getAtmBalance() < withdrawalAmountRequest){
            System.out.println("insufficient fund in the ATM Machine");
            exit(atm);
        }else if(card.getBalance() < withdrawalAmountRequest){
            System.out.println("insufficient fund in the bank account");
            exit(atm);
        }else {
            card.deductBankBalance(withdrawalAmountRequest);
            atm.deductATMBalance(withdrawalAmountRequest);

            CashWithdrawProcessor cashWithdrawProcessor =
                    new TwoThousandWithdrawProcessor(new FiveHundredWithdrawProcessor( new OneHundredWithdrawProcessor(null)));

            cashWithdrawProcessor.withdraw(atm, withdrawalAmountRequest);
            exit(atm);
        }

    }

    @Override
    public void exit(ATM atmObject) {
        returnCard();
        atmObject.setCurrentATMState(new IdleState());
        System.out.println("Exit happens");
    }

    @Override
    public void returnCard() {
        System.out.println("Please collect your card");
    }

}
