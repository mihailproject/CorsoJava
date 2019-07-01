package com.thread;
import java.lang.*;
public class EsempioThread extends java.lang.Thread {

    public void run() {
        System.out.println("sono un il thread"+ getName());
        for (int j=0 ;j<10; j++) {
            System.out.println(j);
        }
        try {
        Thread.sleep(3000);
        }catch (InterruptedException e){e.printStackTrace();}
    }

}
