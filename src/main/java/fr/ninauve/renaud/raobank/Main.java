package fr.ninauve.renaud.raobank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Main {

  private Console console;

  @Autowired
  public Main(Console console) {
    this.console = console;
  }

  public static void main(String... args) {

    final AnnotationConfigApplicationContext applicationContext =
        new AnnotationConfigApplicationContext(MainConfiguration.class);

    final Main main = applicationContext.getBean(Main.class);
    main.run();
    applicationContext.close();
  }

  public void run() {

    console.showMenu();
  }
}
