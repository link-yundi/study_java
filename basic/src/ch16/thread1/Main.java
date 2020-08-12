package ch16.thread1;

public class Main {
    public static void main(String[] args) {
        Thread1 obj = new Thread1();
        // 当我们创建新的线程对象并调用它的start()方法，run()方法语句在另一个线程执行
        obj.start();
        Thread obj2 = new Thread(new Thread2());
        obj2.start();
    }
}
