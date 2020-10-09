package ru.mail.guice;

import com.google.inject.Guice;
import com.google.inject.Injector;

import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.logging.Logger;

public final class Application {
    public void waitForInput() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Waiting for new lines. Key in Ctrl+D to exit.");
            System.out.println("Input command");
            System.out.println("1 - logg with <a>input</a>");
            System.out.println("2 - logg with <h>input</h>");
            while (true) {
                int i = scanner.nextInt();
                final Injector injector = Guice.createInjector(new MainModule());
                final Entity entity = injector.getInstance(Entity.class);
                System.out.println("Input string");
                switch (i){
                    case 1:
                        entity.doLoggA();
                        break;
                    case 2:
                        entity.doLoggH();
                        break;
                }
            }
        } catch (IllegalStateException | NoSuchElementException e) {
        }
    }
}
