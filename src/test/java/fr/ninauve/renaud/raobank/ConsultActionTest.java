package fr.ninauve.renaud.raobank;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ConsultActionTest {
    @InjectMocks
    private ConsultAction consultAction;
    @Mock
    private Console console;
    @Mock
    private AccountDao accountDao;

    private static final String USER_ID = "XXXX";

    @Test
    public void should_consult() {
        when(accountDao.find(USER_ID)).thenReturn(new Account(1234L));
        consultAction.consult(USER_ID);
        verify(console).showBalance(1234L);
    }


}