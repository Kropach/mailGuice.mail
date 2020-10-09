package ru.mail.guice;

import com.google.inject.Inject;
import org.jetbrains.annotations.NotNull;

import java.util.logging.Logger;

public class LoggerImplH implements LoggerInterface {
    @Inject
    private @NotNull
    Logger logger;

    @Override
    public void loggStart() {
        logger.info("<h>");
    }

    @Override
    public void loggFinish() {
        logger.info("</h>");
    }
}
