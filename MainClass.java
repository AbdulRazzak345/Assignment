public class MainClass {
    public static void main(String[] args) {

        int[] arr = {3, 8, 12, 20, 25, 30};

        // Create object of SearchOperations
        binarySearchIterative.SearchOperations searchOps = new binarySearchIterative.SearchOperations();

        // 1. Iterative Binary Search for 20
        int idx1 = searchOps.binarySearchIterative(arr, 20);
        System.out.println("Iterative Binary Search: 20 found at index: " + idx1);

        // 2. Recursive Binary Search for 25
        int idx2 = searchOps.binarySearchRecursive(arr, 25, 0, arr.length - 1);
        System.out.println("Recursive Binary Search: 25 found at index: " + idx2);

        // 3. Recursive Linear Search for 12
        int idx3 = searchOps.recursiveLinearSearch(arr, 12, 0);
        System.out.println("Recursive Linear Search: 12 found at index: " + idx3);

        // 4. Recursive Min and Max
        int min = searchOps.findMin(arr, 0);
        int max = searchOps.findMax(arr, 0);
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}
