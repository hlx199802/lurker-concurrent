package com.lurker.concurrent.old;

import java.util.TimerTask;

public class Timer {

    private static volatile int count = 0;

    static class TimerTaskCus extends TimerTask {

        @Override
        public void run() {
            System.err.println("Boob boom");
        }
    }

    public static void main(String [] args) {
        java.util.Timer timer = new java.util.Timer();
        timer.schedule(new TimerTaskCus(), 1000);
    }

}
