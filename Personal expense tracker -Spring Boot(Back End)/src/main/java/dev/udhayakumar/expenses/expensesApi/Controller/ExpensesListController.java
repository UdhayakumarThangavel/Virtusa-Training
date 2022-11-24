package dev.udhayakumar.expenses.expensesApi.Controller;

import dev.udhayakumar.expenses.expensesApi.Model.ExpensesList;
import dev.udhayakumar.expenses.expensesApi.Service.ExpenseListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ExpensesListController {

    @Autowired
    ExpenseListService expenselistservice;

    @GetMapping(value = "/ExpensesList")
    public List<ExpensesList> getAllExpenses(){
        return expenselistservice.getExpenseList();
    }

    @PostMapping(value = "/AddExpensesList")
    public String addExpenseList(@RequestBody ExpensesList expenseslist){
        return expenselistservice.saveExpensesList(expenseslist);
    }


}
