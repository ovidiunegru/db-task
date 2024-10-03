package org.example.tennis;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;


class PlayTaskTest {

    private final ByteArrayOutputStream consoleLogs = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(consoleLogs));
    }

    @AfterEach
    void tearDown() {
        System.setOut(originalOut);
    }

    @Test
    void taskTest() throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        TableTennis.setRunning(true);

        executor.submit(new PlayTask("ping", true));
        executor.submit(new PlayTask("pong", false));

        TimeUnit.SECONDS.sleep(1);

        TableTennis.setRunning(false);
        executor.shutdown();

        TimeUnit.SECONDS.sleep(1);

        String output = consoleLogs.toString().trim();
        String[] lines = output.split("\n");

        boolean isFairGame = true;
        for (int i = 0; i < lines.length - 1; i++) {
            if (lines[i].equals("ping") && lines[i + 1].equals("ping")) {
                isFairGame = false;
                break;
            } else if (lines[i].equals("pong") && lines[i + 1].equals("pong")) {
                isFairGame = false;
                break;
            }
        }

        assertTrue(isFairGame, "The game is fair: ping pong ping pong");
    }
}
