//Write a program to Sort array in descending order


public class question72 {
     public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7};

        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // Sort in descending order
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("\nSorted Array in Descending Order:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    
}
