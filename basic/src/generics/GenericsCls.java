package generics;

/*
泛型类
 */

import javax.swing.*;

public class GenericsCls<T> {
    private T key;

    public GenericsCls(T key) {
        this.key = key;
    }

    public T getKey() {
        return key;
    }

    public static void main(String[] args) {
        GenericsCls<Integer> integerGenericsCls = new GenericsCls<>(123456);
        System.out.println(integerGenericsCls.getKey());
    }
}
