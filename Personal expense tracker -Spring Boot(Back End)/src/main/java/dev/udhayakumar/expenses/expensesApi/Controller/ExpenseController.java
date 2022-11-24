package dev.udhayakumar.expenses.expensesApi.Controller;


import dev.udhayakumar.expenses.expensesApi.Model.Expense;
import dev.udhayakumar.expenses.expensesApi.Service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ExpenseController {

    @Autowired
    ExpenseService expenseservice;

    @PostMapping(value = "/expenses")
    public String saveExpense(@RequestBody Expense expense){
        return expenseservice.saveExpense(expense);
    }

    @GetMapping(value = "/expenses")
    public List<Expense> getExpense(){
        return expenseservice.getExpense();
    }

    @PutMapping(value = "/expenses")
    public String updateExpense(@RequestBody Expense expense){
        return expenseservice.updateExpense(expense);
    }
}
