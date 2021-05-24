package fr.ninauve.renaud.raobank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SelectOperationAction {

    private final Console console;
    private final OperationParser operationParser;

    @Autowired
    public SelectOperationAction(Console console, OperationParser operationParser) {
        this.console = console;
        this.operationParser = operationParser;
    }


    public Operation select() {
        console.showMenu();
        String operation = console.getUserInput();
        return operationParser.parse(operation);
    }
}
