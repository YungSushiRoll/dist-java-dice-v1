package edu.wctc.dice;

import edu.wctc.dice.iface.DieRoller;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

        ((DieRoller)context.getBean("rollDie")).play();

        context.close();
    }
}
