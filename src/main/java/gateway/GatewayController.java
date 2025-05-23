package com.example.gateway;

import graphql.ExecutionInput;
import graphql.ExecutionResult;
import graphql.GraphQL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/graphql")
public class GatewayController {

    @Autowired
    private GraphQL graphQL;

    @PostMapping
    public Map<String, Object> execute(@RequestBody Map<String, Object> request) {
        ExecutionInput executionInput = ExecutionInput.newExecutionInput()
                .query((String) request.get("query"))
                .operationName((String) request.get("operationName"))
                .variables((Map<String, Object>) request.getOrDefault("variables", Map.of()))
                .build();
        ExecutionResult executionResult = graphQL.execute(executionInput);
        return executionResult.toSpecification();
    }
}
