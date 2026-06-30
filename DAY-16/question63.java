//Write a program to Find pair with given sum.
public class question63 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 5, 1, 3};
        int target = 8;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("Pair found: " + arr[i] + " and " + arr[j]);
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }

        if (!found) {
            System.out.println("No pair found with the given sum.");
        }
    }
}