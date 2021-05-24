package fr.ninauve.renaud.raobank;

import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class Console {

  private final Scanner in = new Scanner(System.in);

  public void showMenu() {

  }

  public void showLoginForm() {
    System.out.println("Please enter your account ID :");
  }

  public void showBalance(long balance){
    System.out.println("Your balance is : "+ balance);
  }

  public String getUserInput() {
    return in.nextLine();
  }
}
