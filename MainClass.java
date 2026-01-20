import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        int[] arr1 = {5, 1, 4, 2, 8};
        int[] arr2 = Arrays.copyOf(arr1, arr1.length);  // same array for Quick Sort

        // Merge Sort
        MergeSort ms = new MergeSort();
        ms.mergeSort(arr1, 0, arr1.length - 1);
        System.out.println("Sorted array (Merge Sort): " + Arrays.toString(arr1));

        // Quick Sort
        QuickSort qs = new QuickSort();
        qs.quickSort(arr2, 0, arr2.length - 1);
        System.out.println("Sorted array (Quick Sort): " + Arrays.toString(arr2));
    }
}
