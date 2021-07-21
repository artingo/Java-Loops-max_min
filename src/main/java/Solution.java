import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] numbers1 = {3, 5, 8, 13, 21, 34, 55};
        System.out.println("numbers1  = " + Arrays.toString(numbers1));
        System.out.println("difference  = " + max_min(numbers1));

        int[] numbers2 = {10, 100, 300, 200, 1000, 20, 30};
        System.out.println("\nnumbers2  = " + Arrays.toString(numbers2));
        System.out.println("difference  = " + max_min(numbers2));

        int[] numbers3 = {1, 2, 3, 4, 10, 20, 30, 40, 100, 200};
        System.out.println("\nnumbers3  = " + Arrays.toString(numbers3));
        System.out.println("difference  = " + max_min(numbers3));
    }

    /**
     * Function that returns the difference between biggest and smallest number in an array
     * @param numbers - Array of positive integers
     * @return difference as Integer
     */
    public static int max_min(int[] numbers) {
        int max = 0, min = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] <= min) {
                min = numbers[i];
            }
            if (numbers[i] >= max) {
                max = numbers[i];
            }
        }
        System.out.println("min = " + min + ", max = " + max);
        return max - min;
    }
}
