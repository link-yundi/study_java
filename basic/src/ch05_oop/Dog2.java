package ch05_oop;

public class Dog2 {
    private String color;

    public Dog2(String color) {
        this.color = color;
    }

    public Dog2() {
        this.setColor("White");
    }

    public void setColor(String color) {
        this.color = color;
    }
}
