package method;

public class CallByReference {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        change(arr);
        System.out.println(arr[0]);
    }

    public static void change(int[] array) {
        // 将数组的第一个元素变为0
        array[0] = 0;
    }
}

// 实际上还是值传递，传递的是引用对象的拷贝，地址依旧指向原来的值