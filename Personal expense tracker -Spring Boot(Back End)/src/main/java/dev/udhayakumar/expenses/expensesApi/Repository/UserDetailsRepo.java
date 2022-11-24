package dev.udhayakumar.expenses.expensesApi.Repository;

import dev.udhayakumar.expenses.expensesApi.Model.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailsRepo extends JpaRepository<UserDetails , Long> {
}
