package com.lurker.concurrent.old;

public class RunnableMain {

    public static void main(String [] args) {
        System.out.println("Main-Thread--start");
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                    System.out.println("Thread-1");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        System.out.println("Main-Thread--end");
    }

}
