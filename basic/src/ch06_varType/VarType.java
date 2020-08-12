package ch06_varType;

// 传值
public class VarType {
    public static void main(String[] args) {
        int x = 10;
        addTo(x);
        System.out.println(x);
    }
    static void addTo(int num) {
        num = num + 1;
    }
}
