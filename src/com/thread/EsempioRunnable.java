package com.thread;

public class EsempioRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("sono un thread runnable");
        for (int j=0; j<10; j++){
            System.out.println(j);}

        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){e.printStackTrace();}
    }
}
