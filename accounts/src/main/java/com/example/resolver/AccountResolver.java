package com.example.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.example.accounts.Account;
import com.example.dto.Transaction;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

@Component
public class AccountResolver implements GraphQLResolver<Account> {

    public List<Transaction> getTransactions(Account account) {
        // Mock transactions (in real scenario, call transactions subgraph)
        return Arrays.asList(
            new Transaction("tx1", account.getId(), 100.0),
            new Transaction("tx2", account.getId(), 150.0)
        );
    }
}