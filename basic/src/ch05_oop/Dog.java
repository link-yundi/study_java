package ch05_oop;

public class Dog {

    private String name;
    private int age;
    private String color;

    public String barking() {
        String voice = "Woof-Woof";
        System.out.println(voice);
        return voice;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

}
