import logger.*;

public class Main {
    public static void main(String[] args) {
        ILogger debugLogger = LoggerFactory.createLogger(LogLevel.DEBUG);
        ILogger infoLogger = LoggerFactory.createLogger(LogLevel.INFO);
        ILogger errorLogger = LoggerFactory.createLogger(LogLevel.ERROR);
        infoLogger.log("This is an info message");
        debugLogger.log("This is a debug message");
        errorLogger.log("This is an error message");
    }
}