import java.util.*;

public class insertionSort {
    public static void unsort(int a[]) {
        System.out.println("Before Sorting the Element ");
        for (int k = 0; k < a.length; k++) {
            System.out.print(a[k] + " ");
        }
    }

    public static void sort(int ar[]) {
        System.out.println("\n After Sorting the Element ");
        for (int k = 0; k < ar.length; k++) {
            System.out.print(ar[k] + " ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int size = sc.nextInt();
        System.out.println("Enter the element of size define");
        int arr[] = new int[size];
        for (int x = 0; x < size; x++) {
            arr[x] = sc.nextInt();
        }
        unsort(arr);
        int temp, j;
        for (int i = 1; i < arr.length; i++) {
            temp = arr[i];
            j = i;
            while (j > 0 && arr[j - 1] > temp) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = temp;
        }
        sort(arr);
    }
}
