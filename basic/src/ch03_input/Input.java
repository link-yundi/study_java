package ch03_input;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner my_var = new Scanner(System.in);
        // 通过nextLine()和next()获取输入的字符串
        System.out.println(my_var.nextLine());
        //System.out.println(my_var.next());
    }
}
