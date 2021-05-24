package fr.ninauve.renaud.raobank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class OperationParserTest {

    private OperationParser operationParser;


    @BeforeEach
    public void setup() {
        this.operationParser = new OperationParser();
    }

    @Test
    public void should_parse_consult() {
        Operation actual = operationParser.parse("CONSULT");
        assertThat(actual).isEqualTo(Operation.CONSULT);
    }

    @Test
    public void should_parse_deposit() {
        Operation actual = operationParser.parse("DEPOSIT");
        assertThat(actual).isEqualTo(Operation.DEPOSIT);
    }

    @Test
    public void should_parse_retreival() {
        Operation actual = operationParser.parse("RETREIVAL");
        assertThat(actual).isEqualTo(Operation.RETRIEVAL);
    }


}