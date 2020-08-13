package method;

public class Main {
    public static void main(String[] args) {
        // todo 生成两个student obj，然后swap
        Student student = new Student("小张");
        Student student1 = new Student("小李");
        swap(student, student1);
        System.out.println("student:" + student.getName());
        System.out.println("student1:" + student1.getName());
    }

    public static void swap(Student x, Student y) {
        Student temp = x;
        x = y;
        y = temp;
        System.out.println("x:" + x.getName());
        System.out.println("y:" + y.getName());
    }
}