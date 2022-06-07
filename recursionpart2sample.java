public class recursionpart2sample {
    public static void fun(int start, int end, int sum) {
        if (start == end) {
            sum += start;
            System.out.println(sum);
            return;
        }
        sum += start;
        fun(start + 1, end, sum);
        System.out.println(start);
    }

    public static void main(String[] args) {
        int s = 1;
        int e = 5;
        int add = 0;
        fun(s, e, add);
    }
}
