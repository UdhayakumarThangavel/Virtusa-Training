package dev.udhayakumar.expenses.expensesApi.Service;

import dev.udhayakumar.expenses.expensesApi.Model.Expense;
import dev.udhayakumar.expenses.expensesApi.Repository.ExpenseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {
    @Autowired
    ExpenseRepo expenserepo;

    public String saveExpense(Expense expense){
        expenserepo.save(expense);
        return "Saved..";
    }


    public List<Expense> getExpense(){
        return expenserepo.findAll();
    }

    public String updateExpense(Expense newexpense){
        return expenserepo.findById(newexpense.getId()).map(expense1 -> {
            expense1.setAmount(newexpense.getAmount());
            expense1.setExpenselistid(newexpense.getExpenselistid());
            expenserepo.save(expense1);
            return "updated";
        }).orElseGet(() ->{
           expenserepo.save(newexpense);
           return "saved";
        });

    }

}
