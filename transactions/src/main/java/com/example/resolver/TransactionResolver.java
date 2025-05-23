package com.example.transactions.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.example.transactions.model.Transaction;
import org.springframework.stereotype.Component;

@Component
public class TransactionResolver implements GraphQLResolver<Transaction> {
    // You can add logic here if needed for field-level resolution
}