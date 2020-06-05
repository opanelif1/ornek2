package com.company;
/* class myThread extends Thread{
    @Override
    public void run() {
        //yapılacak kodlar
    }
} */
public class Main {
    static int i,j;

    public static void main(String[] args) {
        // thread kullanımı

        Thread t1=new Thread() {
            @Override
            public void run() {
                for(i=0;i<100;i++) {
                    System.out.print("a1");
                }
            }
        };
        Thread t2=new Thread() {
            @Override
            public void run() {
                for(j=0;j<100;j++) {
                    System.out.print("a2"); }
            }
        };

        t1.start();
        t2.start();
    }
}

