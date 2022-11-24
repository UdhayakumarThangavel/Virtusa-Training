package dev.udhayakumar.expenses.expensesApi.Controller;

import dev.udhayakumar.expenses.expensesApi.Model.UserDetails;
import dev.udhayakumar.expenses.expensesApi.Repository.UserDetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserDetailsController {

    @Autowired
    private UserDetailsRepo userdetailsrepo ;

    @GetMapping(value = "/AllUsers")
    public List<UserDetails>  getUsers(){
        return userdetailsrepo.findAll();
    }

    @PostMapping(value = "/SaveUser")
    public String saveUser(@RequestBody UserDetails userdetails){
        userdetailsrepo.save(userdetails);
        return "Saved..";
    }
}
