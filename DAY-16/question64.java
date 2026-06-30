//Write a program to Remove duplicates from array


public class question64 {
     public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5, 1, 6};

        System.out.println("Array after removing duplicates:");

        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;

            // Check if the current element has appeared before
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                System.out.print(arr[i] + " ");
            }
        }
    }
    
}
