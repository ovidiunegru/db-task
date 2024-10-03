package org.example.tennis;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


public class TableTennis {

    private static volatile boolean running = true;
    private static boolean pingTurn = true;

    public static boolean isPingTurn() {
        return pingTurn;
    }

    public static void setPingTurn(boolean pingTurn) {
        TableTennis.pingTurn = pingTurn;
    }

    public static boolean isRunning() {
        return running;
    }

    public static void setRunning(boolean running) {
        TableTennis.running = running;
    }
}