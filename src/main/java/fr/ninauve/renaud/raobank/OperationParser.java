package fr.ninauve.renaud.raobank;

import org.springframework.stereotype.Component;

@Component
public class OperationParser {

    public Operation parse(String operation) {
        for (Operation each : Operation.values()) {
            if (each.name().equals(operation)) {
                return each;
            }
        }
        throw new IllegalArgumentException("Could not parse user input");
    }
}

