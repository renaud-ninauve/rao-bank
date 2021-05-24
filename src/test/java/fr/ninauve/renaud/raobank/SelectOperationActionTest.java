package fr.ninauve.renaud.raobank;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class SelectOperationActionTest {

    @InjectMocks
    private SelectOperationAction selectOperationAction;
    @Mock
    private Console console;
    @Mock
    private OperationParser operationParser;

    private static final String USER_INPUT = "XXXX";

    @Test
    public void should_select_operation() {

        when(operationParser.parse(USER_INPUT)).thenReturn(Operation.CONSULT);
        when(console.getUserInput()).thenReturn(USER_INPUT);

        final Operation actual = selectOperationAction.select();
        assertThat(actual).isEqualTo(Operation.CONSULT);

    }


}