package ua.procamp.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ua.procamp.TestDataGenerator;
import ua.procamp.model.Account;

import java.util.ArrayList;
import java.util.List;

/**
 * This controller provides endpoint that generates a list of {@link Account} and passes it to the view.
 * <p>
 * todo: 1. Configure controller that handles requests with url "/accounts"
 * todo: 2. Inject a {@link TestDataGenerator}
 * todo: 3. Implement a method that handles GET request with param "size" to url "/accounts" and forwards it to the accounts.jsp view
 * todo: 4. In this method generate a list of account using data generator and received int value "size"
 * todo: 5. Provide a default value "10" for parameter "size"
 * todo: 6. Pass the list of accounts to the view using model attribute with name "accountList"
 */

@Controller
@RequestMapping("/accounts")
public class AccountController {

    final TestDataGenerator generator;

    @Autowired
    public AccountController(TestDataGenerator testDataGenerator) {
        this.generator = testDataGenerator;
    }

    @GetMapping
    public String getSize(@RequestParam(name = "size", defaultValue = "10") int size, Model model){
        List<Account> accounts = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            accounts.add(generator.generateAccount());
        }
        model.addAttribute( "accountList",accounts);
        return "accounts";
    }

}
