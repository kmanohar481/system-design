package atm.AmountWithdrawal;

import atm.ATM;

public abstract class CashWithdrawProcessor {

    CashWithdrawProcessor nextCashWithdrawalProcessor ;

    CashWithdrawProcessor(CashWithdrawProcessor cashWithdrawProcessor){
        this.nextCashWithdrawalProcessor = cashWithdrawProcessor;
    }


    public void withdraw(ATM atm, int balance){

        if(nextCashWithdrawalProcessor!=null) {
            nextCashWithdrawalProcessor.withdraw(atm, balance);
        }

    }











}
