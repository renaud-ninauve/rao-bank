package fr.ninauve.renaud.raobank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class ConsultAction {
    private final Console console;
    private final AccountDao accountDao;

    @Autowired
    public ConsultAction(Console console, AccountDao accountDao, AccountDao accountDao1) {
        this.console = console;
        this.accountDao = accountDao1;
    }

    public void consult(String userAccount) {
        Date now = new Date();
        System.out.println("As of " + new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(now) + " , Your balance is : " + accountDao.find(userAccount).balance());
    }
}
