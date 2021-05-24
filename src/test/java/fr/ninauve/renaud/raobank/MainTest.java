package fr.ninauve.renaud.raobank;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class MainTest {

  @InjectMocks
  private Main main;
  @Mock
  private AuthenticateAction authenticateAction;
  @Mock
  private SelectOperationAction selectOperationAction;
  @Mock
  private ConsultAction consultAction;
  @Mock
  private DepositAction depositAction;
  @Mock
  private RetrievalAction retrievalAction;

  private static final String USER_ACCOUNT = "user-xxx";

  @Test
  public void should_choose_consult() {

    when(authenticateAction.authenticate())
        .thenReturn(USER_ACCOUNT);
    when(selectOperationAction.select())
        .thenReturn(Operation.CONSULT);

    main.run();

    verify(consultAction).consult(USER_ACCOUNT);
    verifyNoMoreInteractions(depositAction, retrievalAction);
  }

  @Test
  public void should_choose_deposit() {

    when(authenticateAction.authenticate())
        .thenReturn(USER_ACCOUNT);
    when(selectOperationAction.select())
        .thenReturn(Operation.DEPOSIT);

    main.run();

    verify(depositAction).deposit(USER_ACCOUNT);
    verifyNoMoreInteractions(consultAction, retrievalAction);
  }

  @Test
  public void should_choose_retrieval() {

    when(authenticateAction.authenticate())
        .thenReturn(USER_ACCOUNT);
    when(selectOperationAction.select())
        .thenReturn(Operation.RETRIEVAL);

    main.run();

    verify(retrievalAction).retrieval(USER_ACCOUNT);
    verifyNoMoreInteractions(consultAction, retrievalAction);
  }
}