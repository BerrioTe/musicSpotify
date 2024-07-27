package com.open.spotify.utils;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class WaitUtils {
    public static void waitForSongToPlay(int seconds) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        scheduler.schedule(() -> {
        }, seconds, TimeUnit.SECONDS);
        try {
            scheduler.awaitTermination(seconds + 1, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        scheduler.shutdown();
    }
}
