//Write a program to Find maximum frequency element


public class question62 {
     public static void main(String[] args) {
        int[] arr = {2, 3, 5, 2, 3, 2, 4, 5, 5, 5};

        int maxCount = 0;
        int maxElement = arr[0];

        for (int i = 0; i < arr.length; i++) {
            int count = 1;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                maxElement = arr[i];
            }
        }

        System.out.println("Element with Maximum Frequency: " + maxElement);
        System.out.println("Frequency: " + maxCount);
    }
    
}
