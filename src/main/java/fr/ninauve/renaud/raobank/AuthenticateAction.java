package fr.ninauve.renaud.raobank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AuthenticateAction {

  private final Console console;

  @Autowired
  public AuthenticateAction(Console console) {
    this.console = console;
  }

  public String authenticate() {

    return null;
  }
}
