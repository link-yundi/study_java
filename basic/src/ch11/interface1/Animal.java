package ch11.interface1;

public interface Animal {
    void eating();
    void barking();
}

/*
接口有以下特性：
    - 接口是隐式抽象的，当声明一个接口时，不必使用abstract关键字
    - 接口中每一个方法也是隐式抽象的，声明时同样不需要abstract关键字
    - 接口中的方法都是公有的，缺省默认public
一个类只能继承一个类，但是能够实现多个接口
-----------------
接口的实现
当类实现接口的时候，**类要实现接口中所有的方法。否则，类必须声明为抽象的类**
类使用 implements 关键字实现接口。在类声明中，implements 关键字放在class声明后面
 */