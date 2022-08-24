package mbn;

public class Calculator {

    private AppLogger appLogger;

    public Calculator(AppLogger appLogger) {
        this.appLogger = appLogger;
    }

    public int add(int a, int b) {
        appLogger.log(String.format("Executing %s + %s", a, b));
        return a + b;
    }
}
