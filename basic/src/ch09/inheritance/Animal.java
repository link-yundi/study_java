package ch09.inheritance;

/*
animal 父类
 */

public class Animal {
    protected int legs;
    public void eat() {
        System.out.println("Aniaml eats");
    }

    public int getLegs() {
        return legs;
    }
}
