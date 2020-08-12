package ch12.typechange;

/*
内部类：
java支持嵌套类，一个类可以是另一个类的成员
创建的方法也很简单，只要在类中编写一个类
作用：
    - 实现了更好的封装，我们知道，普通类（非内部类）的访问修饰符不能为private或者protected，而内部类可以。当我们内部类声明为private时，只有外部类可以访问内部类，很好地隐藏了内部类。
    - 内部类可以继承(extends)或实现(implements)其他的类或者接口，而不受外部类的影响
    - 内部类可以直接访问外部类的字段和方法，即使是用private修饰的，相反的，外部类不能直接访问内部类的成员
 */

public class InnerCls {
    int id;
    InnerCls(int i) {
        id = i;
        Brain b = new Brain();
        b.think();
    }
    private class Brain {
        public void think() {
            System.out.println(id + " is thinking");
        }
    }

    public static void main(String[] args) {
        InnerCls c = new InnerCls(3);
    }
}
