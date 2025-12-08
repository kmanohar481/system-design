package atm.ATMStates;

import atm.ATM;
import atm.Card;

public class IdleState  extends  ATMState {

      @Override
      public void insertCard(ATM atm, Card card){
          System.out.println("card is inserted");
          atm.setCurrentATMState(new HasCardState());
      }
}
