package com.company;

public class runeb implements Runnable{

    @Override
    public void run() {
        System.out.println("Running");
        try {
            Thread.sleep(3000);
            run();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
