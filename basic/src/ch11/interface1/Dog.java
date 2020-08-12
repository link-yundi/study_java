package ch11.interface1;

/*
当你实现一个接口时，你需要重写接口中的所有方法
 */

public class Dog implements Animal{
    @Override
    public void barking() {
        System.out.println("Woof-Woof");
    }

    @Override
    public void eating() {
        System.out.println("crunch-crunch");
    }
}
