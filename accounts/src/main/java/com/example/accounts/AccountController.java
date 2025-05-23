package com.example.accounts;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/accounts")
public class AccountController {
    @GetMapping
    public List<Account> getAccounts() {
        return List.of(new Account()); // this is mock data
    }
}
