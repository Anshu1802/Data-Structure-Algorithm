import java.util.Scanner;

public class bubbleSort {
    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length");
        int len = sc.nextInt();
        int sort[] = new int[len];
        System.out.println("Enter the Element to sort");
        for (int k = 0; k < len; k++) {
            sort[k] = sc.nextInt();

        }

        for (int i = 0; i < sort.length - 1; i++) {
            for (int j = 0; j < sort.length - i - 1; j++) {
                if (sort[j] > sort[j + 1]) {
                    int empty = sort[j];
                    sort[j] = sort[j + 1];
                    sort[j + 1] = empty;
                }
            }
        }
        print(sort);
    }
}