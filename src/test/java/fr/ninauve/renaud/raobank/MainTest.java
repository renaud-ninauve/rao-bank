package fr.ninauve.renaud.raobank;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class MainTest {

  @InjectMocks
  private Main main;
  @Mock
  private Console console;

  @Test
  public void should_display_menu() {

    main.run();
    verify(console).showMenu();
  }
}