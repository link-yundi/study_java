package ch06_varType;

/**
 * @author zhangyundi
 */
// 传引用

public class Pointer {
    private static class Student {
        private String name;
        private int age;

        public Student(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
    public static void main(String[] args) {
        Student j;
        // 当你使用构造函数创建对象时，你将创建一个引用变量
        j = new Student("Jing");
        j.setAge(18);
        addTo(j);
        System.out.println(j.getAge());
    }

    static void addTo(Student s) {
        s.setAge(s.getAge() + 1);
    }
}
