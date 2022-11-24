package dev.udhayakumar.expenses.expensesApi.Repository;

import dev.udhayakumar.expenses.expensesApi.Model.ExpensesList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpensesListRepo extends JpaRepository<ExpensesList ,Long> {
}
