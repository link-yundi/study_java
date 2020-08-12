package ch10.abstract1;

abstract class Animal {
    int legs = 0;
    // 每种动物都会发出声音，但是每种动物的叫声都是不一样的。所以定义animal抽象类，并且把它们如何发出声音的实现留给子类
    abstract void barking();
}
