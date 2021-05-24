package fr.ninauve.renaud.raobank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Main {

  private final AuthenticateAction authenticateAction;
  private final SelectOperationAction selectOperationAction;
  private final ConsultAction consultAction;
  private final DepositAction depositAction;
  private final RetrievalAction retrievalAction;

  @Autowired
  public Main(AuthenticateAction authenticateAction,
      SelectOperationAction selectOperationAction,
      ConsultAction consultAction, DepositAction depositAction,
      RetrievalAction retrievalAction) {

    this.authenticateAction = authenticateAction;
    this.selectOperationAction = selectOperationAction;
    this.consultAction = consultAction;
    this.depositAction = depositAction;
    this.retrievalAction = retrievalAction;
  }

  public static void main(String... args) {

    final AnnotationConfigApplicationContext applicationContext =
        new AnnotationConfigApplicationContext(MainConfiguration.class);

    final Main main = applicationContext.getBean(Main.class);
    main.run();
    applicationContext.close();
  }

  public void run() {

    final String userAccount = authenticateAction.authenticate();
    final Operation operation = selectOperationAction.select();
    switch (operation) {
      case CONSULT:
        consultAction.consult(userAccount);
        break;
      case DEPOSIT:
        depositAction.deposit(userAccount);
        break;
      case RETRIEVAL:
        retrievalAction.retrieval(userAccount);
        break;
    }
  }
}
