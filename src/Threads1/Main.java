package Threads1;

public class Main {

    public static void main(String[] args) {

//        MyThread t1 = new MyThread("T1");
//        MyThread t2 = new MyThread("T2");
//
//        t1.start();
//        t2.start();
//
//        t1.run();// ран - выполняет все в мейн потоке
//        t2.run();

//        Thread t1 = new Thread(new MyRunnable());
//        Thread t2 = new Thread(new MyRunnable());
//
//        t1.start();
//        t2.start();

//        Thread t1 = new Thread(new MyRunnable());
//        Thread t2 = new Thread(new MyRunnable());


//        Thread t1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 10; i++) {
//                    System.out.println(i + " " + Thread.currentThread().getName());
//                }
//            }
//        });
//
//        Thread t2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 10; i++) {
//                    System.out.println(i + " " + Thread.currentThread().getName());
//                }
//            }
//        });

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i + " " + Thread.currentThread().getName());
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i + " " + Thread.currentThread().getName());
            }
        });

        t1.start();
        t2.start();



    }
}
