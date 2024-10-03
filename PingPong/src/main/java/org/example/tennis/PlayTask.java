package org.example.tennis;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PlayTask implements Runnable {
    private final String message;
    private final boolean isPing;

    private static final Lock lock = new ReentrantLock();

    public PlayTask(String message, boolean isPing) {
        this.message = message;
        this.isPing = isPing;
    }

    @Override
    public void run() {
        while (TableTennis.isRunning()) {
            lock.lock();
            try {
                if (isPing == TableTennis.isPingTurn()) {
                    System.out.println(message);
                    TableTennis.setPingTurn(!TableTennis.isPingTurn());
                }
            } finally {
                lock.unlock();
            }
        }
    }
}