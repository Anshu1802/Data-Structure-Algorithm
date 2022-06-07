import java.util.Scanner;

public class timepass {
    public static void fun(int number, int start, int end, int c) {
        if (start == end) {
            c = number * start;
            System.out.println(number + "X" + start + "=" + c);
            return;
        }
        c = number * start;
        fun(number, start + 1, end, c);
        System.out.println(number + "X" + start + "=" + c);
    }

    public static void main(String[] args) {
        System.out.println("Enter the number to print multiplication table");
        Scanner sc = new Scanner(System.in);
        int userinput = sc.nextInt();
        fun(userinput, 1, 10, 0);
    }
}
