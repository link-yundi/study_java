package ch08.encapsulation;

/*
封装、继承、多态
封装：背后的想法是确保细节对用户不可见
- 良好的封装能够减少耦合
- 类内部的结构可以自由修改
- 可以对成员变量进行更精确的控制
- 隐藏信息，实现细节
 */

public class Encapsulaiton {
    /**
     * 隐藏balance 变量，只能通过deposit方法来访问，在修改变量之前验证了要存入的金额
     */
    private double balance = 0;
    public void deposit(double x) {
        if (x > 0) {
            balance += x;
        }
    }
}
