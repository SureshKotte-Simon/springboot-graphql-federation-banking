package com.example.transactions;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/transactions")
public class TransactionController {
    @GetMapping
    public List<Transaction> getTransactions() {
        return List.of(new Transaction()); // mock data
    }
}
