package fr.ninauve.renaud.raobank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AccountTest {

  private Account account;

  private static final long BALANCE_INIT = 1000L;
  private static final long AMOUNT = 12L;
  private static final long BALANCE_AFTER_DEPOSIT = 1012L;
  private static final long BALANCE_AFTER_RETRIEVE = 988L;

  @BeforeEach
  public void setUp() {

    this.account = new Account(BALANCE_INIT);
  }

  @Test
  public void should_consult() {

    final long actual = account.balance();

    assertThat(actual).isEqualTo(BALANCE_INIT);
  }

  @Test
  public void should_deposit() {

    account.deposit(AMOUNT);

    final long actual = account.balance();

    assertThat(actual).isEqualTo(BALANCE_AFTER_DEPOSIT);
  }

  @Test
  public void should_retrieve() {

    account.retrieval(AMOUNT);

    final long actual = account.balance();

    assertThat(actual).isEqualTo(BALANCE_AFTER_RETRIEVE);
  }
}