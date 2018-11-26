package com.lurker.concurrent.old;

public class ThreadMain {

    public static void main(String [] args) {
        System.out.println(789);
        new Thread() {
            @Override
            public void run() {
                try {
                    System.out.println(123);
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();
        System.out.println(456);
    }

}
