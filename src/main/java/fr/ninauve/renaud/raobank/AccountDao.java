package fr.ninauve.renaud.raobank;

import org.springframework.stereotype.Component;

@Component
public class AccountDao {

  private Account account = new Account(1000L);

  public Account find(String userAccount) {

    return account;
  }

  public void update(Account account) {

    this.account = account;
  }
}
