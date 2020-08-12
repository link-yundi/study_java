package ch16.thread1;

/*
创建线程的第二种方法：实现Runnable接口。
实现run()方法。然后，创建一个新的thread对象，将runnable类传递给它的构造函数，并通过调用start()方法来启动thread
 */

public class Thread2 implements Runnable{

    @Override
    public void run() {
        System.out.println("Hello Lu");
    }
}
