import java.util.Scanner;

public class bubbleSort {
    public static void afterlogic(int arr[]) {
        System.out.println("\n After logic array looks like ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void beforelogic(int arr[]) {
        System.out.println("Before logic array looks like ");
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
        beforelogic(sort);
        for (int i = 0; i < sort.length - 1; i++) {

            for (int j = 0; j < sort.length - i - 1; j++) {
                if (sort[j] > sort[j + 1]) {
                    int empty = sort[j];
                    sort[j] = sort[j + 1];
                    sort[j + 1] = empty;
                }
            }
        }

        afterlogic(sort);
    }
}

// Time Complexity for bubble sort is n^2 because we have 2 loops in a code
// which is running n-1 times by ignoring constant.

// we find that first loop runs n times second run n times n*n=n^2 . now why not
// n+m times ? because loops are nested not individuals
// so for that reason time complexity comes to n^2