import java.util.*;

public class selectionSort {
    public static void beforeSort(int array[]) {
        System.out.println("Before selection sort");
        for (int x = 0; x < array.length; x++) {
            System.out.print(array[x] + " ");
        }
    }

    public static void afterSort(int ar[]) {
        System.out.println(" \nafter selection sort");
        for (int x = 0; x < ar.length; x++) {
            System.out.print(ar[x] + " ");
        }
    }

    public static void main(String args[]) {
        System.out.println("Enter The Array Length ");
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        System.out.println("Enter Random numbers to get sorted ");
        int arr[] = new int[len];
        for (int k = 0; k < len; k++) {
            arr[k] = sc.nextInt();
        }
        beforeSort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
        }
        afterSort(arr);
    }
}
// timeComplexity=n^2