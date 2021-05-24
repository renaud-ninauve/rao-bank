package fr.ninauve.renaud.raobank;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class Account {

  private long balance;

  public Account(long balance) {
    this.balance = balance;
  }

  public void deposit(long amount) {

    this.balance += amount;
  }

  public void retrieval(long amount) {

    this.balance -= amount;
  }

  public long balance() {

    return balance;
  }
}
