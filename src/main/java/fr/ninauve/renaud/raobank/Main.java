package fr.ninauve.renaud.raobank;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Main {

  public static void main(String... args) {

    final AnnotationConfigApplicationContext applicationContext =
        new AnnotationConfigApplicationContext(MainConfiguration.class);

    final Main main = applicationContext.getBean(Main.class);
    main.run();
    applicationContext.close();
  }

  public void run() {

    System.out.println("hello");
  }
}
