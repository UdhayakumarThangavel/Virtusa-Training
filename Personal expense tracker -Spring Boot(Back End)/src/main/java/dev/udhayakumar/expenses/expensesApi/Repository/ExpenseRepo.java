package dev.udhayakumar.expenses.expensesApi.Repository;

import dev.udhayakumar.expenses.expensesApi.Model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepo extends JpaRepository<Expense ,Long> {
}
