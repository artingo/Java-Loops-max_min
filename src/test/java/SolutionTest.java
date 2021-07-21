import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void max_min_52() {
        int[] numbers = {3, 5, 8, 13, 21, 34, 55};
        int result = Solution.max_min(numbers);
        assertTrue(result == 52);
    }
    @Test
    void max_min990() {
        int[] numbers = {10, 100, 300, 200, 1000, 20, 30};
        int result = Solution.max_min(numbers);
        assertTrue(result == 990);
    }
    @Test
    void max_min_199() {
        int[] numbers = {1, 2, 3, 4, 10, 20, 30, 40, 100, 200};
        int result = Solution.max_min(numbers);
        assertTrue(result == 199);
    }
}