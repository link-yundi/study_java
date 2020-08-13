package ch13.Obj;

/*
   当你创建对象时，变量存储的是对象的引用。
   所以，当使用（==）比较对象时，它实际上比较的是引用而不是对象值

 */

import java.util.Objects;

public class Equal {
    String name;
    Equal(String n) {
        name = n;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Equal equal = (Equal) o;
        return Objects.equals(name, equal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public static void main(String[] args) {
        Equal a = new Equal("Kitty");
        Equal b = new Equal("Kitty");
        System.out.println(a.equals(b));
    }
}

