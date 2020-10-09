package ru.mail.guice;

import com.google.inject.AbstractModule;

public class MainModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(LoggerInterface.class).annotatedWith(MyLoggA.class).to(LoggerImplA.class);
        bind(LoggerInterface.class).annotatedWith(MyLoggH.class).to(LoggerImplH.class);
    }
}
