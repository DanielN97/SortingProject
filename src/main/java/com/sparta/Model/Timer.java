package com.sparta.Model;

public final class Timer {
    private static long startTime;

    public static void start() {
        startTime = System.nanoTime();
    }

    public static long runTime() {
        return (System.nanoTime() - startTime) / 1000;
    }
}
