import java.util.*;

public class recursionpart1sample {
    public static void fun(int n) {
        if (n == 0) {
            return;
        }
        System.out.println("\n" + n);
        fun(n - 1);
    }

    public static void main(String[] args) {
        System.out.println("Enter the Number ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        fun(number);
    }
}