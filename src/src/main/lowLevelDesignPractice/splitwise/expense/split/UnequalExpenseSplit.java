package splitwise.expense.split;

import java.util.List;

public class UnequalExpenseSplit implements ExpenseSplit {

    @Override
    public void validateSplitRequest(List<Split> splitList, double totalAmount) {

        double sum = 0.0 ;

        for(Split split : splitList){
            sum  = sum + split.getAmountOwe();
        }

        if(sum != totalAmount){
            throw new RuntimeException("there is issue in total amount");
        }

    }

}
