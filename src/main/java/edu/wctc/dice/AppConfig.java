package edu.wctc.dice;

import edu.wctc.dice.iface.DieRoller;
import edu.wctc.dice.iface.GameInput;
import edu.wctc.dice.iface.GameOutput;
import edu.wctc.dice.impl.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("edu.wctc.dice")
public class AppConfig {
    @Bean
    public GameOutput gameOutput() {
//        return new ConsoleOutput();
        return new PopupOutput();
    }

    @Bean
    public GameInput gameInput() {
//        return new ConsoleInput();
        return new PopupInput();
    }

    @Bean
    public DieRoller rollDie() {
        //return new D4(gameInput(), gameOutput());
        //return new D6(gameInput(), gameOutput());
        //return new D8(gameInput(), gameOutput());
        //return new D10(gameInput(), gameOutput());
        //return new D12(gameInput(), gameOutput());
        return new D20(gameInput(), gameOutput());
    }
}
