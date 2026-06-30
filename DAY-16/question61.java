//Write a program to Find missing number in array
public class question61 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6}; // Missing number is 3

        int n = arr.length + 1;

        // Sum of first n natural numbers
        int expectedSum = n * (n + 1) / 2;

        // Sum of array elements
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }

        int missingNumber = expectedSum - actualSum;

        System.out.println("Missing Number: " + missingNumber);
    }
}

