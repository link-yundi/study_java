package ch16.thread1;

/*
java 提供了两种创建线程的方法
创建一个线程的第一种方法时创建一个新的类，该类继承了Thread类，然后创建一个该类的实例
继承类必须重写run()方法，该方法时新线程的入口点。它也必须调用start()方法才能执行
 */

public class Thread1 extends Thread {
    @Override
    public void run() {
        System.out.println("Hello Lu");
    }
}
