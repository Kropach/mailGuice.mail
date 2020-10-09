package ru.mail.guice;

import com.google.inject.Inject;
import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class Entity {
    private final @NotNull LoggerInterface loggA;
    private final @NotNull LoggerInterface loggH;
    private Scanner scanner = new Scanner(System.in);

    @Inject
    public Entity(@NotNull @MyLoggA LoggerInterface loggA, @NotNull @MyLoggH LoggerInterface loggH) {
        this.loggA = loggA;
        this.loggH = loggH;
    }

    public void doLoggA(){
        loggA.loggStart();
        System.out.println(scanner.next());
        loggA.loggFinish();
    }

    public void doLoggH(){
        loggH.loggStart();
        System.out.println(scanner.next());
        loggH.loggFinish();
    }
}
