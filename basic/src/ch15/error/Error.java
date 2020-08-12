package ch15.error;

public class Error {
    public static void main(String[] args) {
        try {
            int[] a = new int[2];
            System.out.println(a[3]);
        } catch (Exception e) {
            System.out.println("An error occurred");
        }
    }
}
