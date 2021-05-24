package fr.ninauve.renaud.raobank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AccountDaoTest {

  private static final String USER_ACCOUNT = "xxxx";
  private AccountDao dao;

  @BeforeEach
  public void setUp() {

    this.dao = new AccountDao();
  }

  @Test
  public void should_find() {

    final Account actual = dao.find(USER_ACCOUNT);

    assertThat(actual).isEqualTo(new Account(1000L));
  }

  @Test
  public void should_update() {

    final Account account = dao.find(USER_ACCOUNT);
    account.deposit(200L);
    dao.update(account);

    final Account actual = dao.find(USER_ACCOUNT);

    assertThat(actual).isEqualTo(new Account(1200L));
  }
}