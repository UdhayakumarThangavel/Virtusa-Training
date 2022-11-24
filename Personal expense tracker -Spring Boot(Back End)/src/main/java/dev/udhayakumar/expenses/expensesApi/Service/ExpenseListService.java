package dev.udhayakumar.expenses.expensesApi.Service;

import dev.udhayakumar.expenses.expensesApi.Model.ExpensesList;
import dev.udhayakumar.expenses.expensesApi.Repository.ExpensesListRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseListService {

    @Autowired
    ExpensesListRepo expenseslistrepo;

    public List<ExpensesList> getExpenseList(){
        return expenseslistrepo.findAll();
    }

    public String saveExpensesList(ExpensesList expenseslist){
        expenseslistrepo.save(expenseslist);
        return "Saved";
    }
}
