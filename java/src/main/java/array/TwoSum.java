package array;

import java.util.HashMap;
import java.util.Optional;

public class TwoSum {
    public record IndexPair(int first, int second) {}

    public static Optional<IndexPair> twoSum(int[] nums, int target) {
        var map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return Optional.of(new IndexPair(i, map.get(complement)));
            }
            map.put(nums[i], i);
        }

        return Optional.empty();
    }

    public static void main(String[] args) {
        var result = twoSum(new int[] {2, 7, 11, 15}, 9);
        result.ifPresentOrElse(
            pair -> System.out.printf("Indices: [%d, %d]%n", pair.first(), pair.second()),
            () -> System.out.println("No solution found")
        );
    }

}
