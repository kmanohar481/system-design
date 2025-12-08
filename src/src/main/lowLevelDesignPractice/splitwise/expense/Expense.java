package splitwise.expense;

import splitwise.expense.split.Split;
import splitwise.user.User;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Expense {

    double expenseAmount ;

    List<Split> splitDetails = new ArrayList<>();

    ExpenseSplitType splitType;

    String description;

    User paidByUser;

    String expenseId;

    public Expense(String expenseId, double expenseAmount, String description,
                   User paidByUser, ExpenseSplitType splitType, List<Split> splitDetails) {

        this.expenseId = expenseId;
        this.expenseAmount = expenseAmount;
        this.description = description;
        this.paidByUser = paidByUser;
        this.splitType = splitType;
        this.splitDetails.addAll(splitDetails);

    }

}
