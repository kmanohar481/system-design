package splitwise.expense.split;

import java.util.List;

public class EqualExpenseSplit implements  ExpenseSplit {

    @Override
    public void validateSplitRequest(List<Split> splitList, double totalAmount) {

        double balanceAmountPerPerson = totalAmount / (splitList.size());

        for(Split split : splitList){
            if(split.getAmountOwe() != balanceAmountPerPerson){
                throw  new RuntimeException("exception in this");
            }
        }

    }

}
