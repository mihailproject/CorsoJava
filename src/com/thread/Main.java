package com.thread;

public class Main {
    public static void main(String[] args) {
//        EsempioThread et=new EsempioThread();
//        et.start();
//
//
//
//        Thread t = new Thread(new EsempioRunnable());
//        t.start();


        EsempioThread  t1 = new EsempioThread();
        t1.setName("thread 1");
        EsempioThread  t2 = new EsempioThread();
        t2.setName("thread 2");
        EsempioThread  t3 = new EsempioThread();
        t3.setName("thread 3");
        EsempioThread  t4 = new EsempioThread();
        t4.setName("thread 4");
        EsempioThread  t5 = new EsempioThread();
        t5.setName("thread 5");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
