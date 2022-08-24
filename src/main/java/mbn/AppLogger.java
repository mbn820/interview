package mbn;

import java.time.LocalDateTime;

public class AppLogger {

    public void log(String message) {
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.printf("[%s] - %s", currentDateTime, message);
    }
}
